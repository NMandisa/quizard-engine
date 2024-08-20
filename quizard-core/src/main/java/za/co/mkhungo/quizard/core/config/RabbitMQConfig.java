package za.co.mkhungo.quizard.core.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Noxolo.Mkhungo
 */
@Configuration
public class RabbitMQConfig {
    @Value("${rabbitmq.host}")
    private String host;

    @Value("${rabbitmq.port}")
    private int port;

    @Value("${rabbitmq.username}")
    private String username;

    @Value("${rabbitmq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        return connectionFactory.getRabbitConnectionFactory();
    }


    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate((org.springframework.amqp.rabbit.connection.ConnectionFactory) connectionFactory);
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        return rabbitTemplate;
    }

    @Bean
    public Queue quizCreatedQueue() {
        return new Queue("quiz.created", false);
    }

    @Bean
    public Queue quizUpdatedQueue() {
        return new Queue("quiz.updated", false);
    }

    @Bean
    public Exchange quizExchange() {
        return new DirectExchange("quiz.exchange");
    }

    @Bean
    public Binding quizCreatedBinding() {
        return BindingBuilder.bind(quizCreatedQueue()).to(quizExchange()).with("quiz.created").noargs();
    }

    @Bean
    public Binding quizUpdatedBinding() {
        return BindingBuilder.bind(quizUpdatedQueue()).to(quizExchange()).with("quiz.updated").noargs();
    }


}

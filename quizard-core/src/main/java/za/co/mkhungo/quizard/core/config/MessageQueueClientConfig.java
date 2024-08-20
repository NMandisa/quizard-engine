package za.co.mkhungo.quizard.core.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */

@Configuration
public class MessageQueueClientConfig {

    private final RabbitTemplate rabbitTemplate;
    @Autowired
    public MessageQueueClientConfig(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String routingKey, Quiz quiz) {
        rabbitTemplate.convertAndSend(routingKey, quiz);
    }

}

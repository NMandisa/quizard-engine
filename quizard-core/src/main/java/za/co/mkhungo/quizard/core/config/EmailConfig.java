package za.co.mkhungo.quizard.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @author Noxolo.Mkhungo
 */
@Configuration
public class EmailConfig {
    private static final int GMAIL_SMTP_PORT = 587;
    @Value("${quizard.email.sender.host}")
    private String host;

    @Value("${quizard.email.sender.user}")
    private String user;

    @Value("${quizard.email.sender.password}")
    private String password;

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        // Set up Gmail config
        //mailSender.setPort(587);
        mailSender.setHost(host);
       // mailSender.setHost("(link unavailable)");
        mailSender.setPort(GMAIL_SMTP_PORT);
        // Set up email config (using quizard email)
        mailSender.setUsername(user);
        //mailSender.setUsername("your-email@example.com");
        mailSender.setPassword(password);
        //mailSender.setPassword("your-password");
        //mailSender.setJavaMailProperties(getMailProperties());
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        return mailSender;
    }
}

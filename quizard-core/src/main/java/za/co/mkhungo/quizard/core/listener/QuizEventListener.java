package za.co.mkhungo.quizard.core.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.config.MessageQueueClientConfig;
import za.co.mkhungo.quizard.core.event.QuizCreatedEvent;
import za.co.mkhungo.quizard.core.event.QuizUpdatedEvent;
import za.co.mkhungo.quizard.core.utils.EmailUtil;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class QuizEventListener {

    private final MessageQueueClientConfig messageQueueClient;
    private final RetryTemplate retryTemplate;
    private final EmailUtil emailUtil;

    @Autowired
    public QuizEventListener(EmailUtil emailUtil, MessageQueueClientConfig messageQueueClient, RetryTemplate retryTemplate) {
        this.emailUtil = emailUtil;
        this.messageQueueClient = messageQueueClient;
        this.retryTemplate = retryTemplate;
    }


    @EventListener
    public void handleQuizCreatedEvent(QuizCreatedEvent event) {
        retryTemplate.execute(context -> {
            messageQueueClient.sendMessage("quiz.created", event.getQuiz());
            return null;
        });
        emailUtil.sendEmail("recipient@example.com", "Quiz Created", "A new quiz has been created");
    }

    @EventListener
    public void handleQuizUpdatedEvent(QuizUpdatedEvent event) {
        retryTemplate.execute(context -> {
            messageQueueClient.sendMessage("quiz.updated", event.getQuiz());
            return null;
        });
        emailUtil.sendEmail("recipient@example.com", "Quiz Updated", "A quiz has been updated");
    }
}

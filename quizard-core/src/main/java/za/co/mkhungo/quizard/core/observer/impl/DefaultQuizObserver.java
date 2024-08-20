package za.co.mkhungo.quizard.core.observer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.observer.QuizObserver;
import za.co.mkhungo.quizard.core.utils.EmailUtil;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultQuizObserver implements QuizObserver {
    private final EmailUtil emailUtil;
    @Autowired
    public DefaultQuizObserver(EmailUtil emailUtil) {
        this.emailUtil = emailUtil;
    }

    @Override
    public void notifyQuizCreated(Quiz quiz) {
        String subject = "Quiz Created: " + quiz.getTitle();
        String body = "Your quiz has been created successfully.";
        emailUtil.sendEmail(quiz.getCreatedBy().getEmail(), subject, body);
    }

    @Override
    public void notifyQuizUpdated(Quiz quiz) {
        String subject = "Quiz Updated: " + quiz.getTitle();
        String body = "Your quiz has been updated successfully.";
        emailUtil.sendEmail(quiz.getCreatedBy().getEmail(), subject, body);
    }

    @Override
    public void notifyQuizDeleted(Quiz quiz) {
        // No email notification needed for deletion
    }
}

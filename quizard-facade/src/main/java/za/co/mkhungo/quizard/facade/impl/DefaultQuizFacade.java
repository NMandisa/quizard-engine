package za.co.mkhungo.quizard.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.event.QuizCreatedEvent;
import za.co.mkhungo.quizard.core.event.QuizUpdatedEvent;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.facade.QuizFacade;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultQuizFacade implements QuizFacade {
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public DefaultQuizFacade(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        // Create the quiz logic here
        Quiz createdQuiz = null; // save quiz to database or perform creation logic
        eventPublisher.publishEvent(new QuizCreatedEvent(createdQuiz));
        return createdQuiz;
    }
    @Override
    public Quiz updateQuiz(Quiz quiz) {
        // Update the quiz logic here
        Quiz updatedQuiz = null; // save quiz to database or perform update logic
        eventPublisher.publishEvent(new QuizUpdatedEvent(updatedQuiz));
        return updatedQuiz;
    }
}

package za.co.mkhungo.quizard.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.event.QuizCreatedEvent;
import za.co.mkhungo.quizard.core.event.QuizUpdatedEvent;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.dto.QuizDTO;
import za.co.mkhungo.quizard.facade.QuizFacade;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Component
public class DefaultQuizFacade implements QuizFacade {
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public DefaultQuizFacade(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public QuizDTO createQuiz(QuizDTO quizDTO) {
        // Create the quiz logic here
        Quiz createdQuiz = null; // save quiz to database or perform creation logic
        eventPublisher.publishEvent(new QuizCreatedEvent(createdQuiz));
        return null;
    }
    @Override
    public QuizDTO updateQuiz(QuizDTO quizDTO) {
        // Update the quiz logic here
        Quiz updatedQuiz = null; // save quiz to database or perform update logic
        eventPublisher.publishEvent(new QuizUpdatedEvent(updatedQuiz));
        return null;
    }
}

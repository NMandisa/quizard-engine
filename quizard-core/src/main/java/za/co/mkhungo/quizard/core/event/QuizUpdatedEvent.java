package za.co.mkhungo.quizard.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
public class QuizUpdatedEvent extends ApplicationEvent {
    private final Quiz quiz;
    public QuizUpdatedEvent(Quiz quiz) {
        super(quiz);
        this.quiz = quiz;
    }
}

package za.co.mkhungo.quizard.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
public class QuizCreatedEvent extends ApplicationEvent {
    private final Quiz quiz;
    public QuizCreatedEvent(Quiz quiz) {
        super(quiz);
        this.quiz = quiz;
    }
}

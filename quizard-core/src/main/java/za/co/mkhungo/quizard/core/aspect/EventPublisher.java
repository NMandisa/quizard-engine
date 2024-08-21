package za.co.mkhungo.quizard.core.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.event.QuizCreatedEvent;
import za.co.mkhungo.quizard.core.event.QuizUpdatedEvent;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class EventPublisher {
    @AfterReturning(pointcut = "execution(* QuizService.createQuiz(..))")
    public void publishQuizCreatedEvent(JoinPoint joinPoint) {
        Quiz quiz = (Quiz) joinPoint.getArgs()[0];
        QuizCreatedEvent event = new QuizCreatedEvent(quiz);
        // Publish event to QuizEventListener
    }

    @AfterReturning(pointcut = "execution(* QuizService.updateQuiz(..))")
    public void publishQuizUpdatedEvent(JoinPoint joinPoint) {
        Quiz quiz = (Quiz) joinPoint.getArgs()[0];
        QuizUpdatedEvent event = new QuizUpdatedEvent(quiz);
        // Publish event to QuizEventListener
    }
}

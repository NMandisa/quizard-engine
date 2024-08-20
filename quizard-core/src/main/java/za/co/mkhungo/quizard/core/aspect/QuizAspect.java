package za.co.mkhungo.quizard.core.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.observer.QuizObserver;

/**
 * @author Noxolo.Mkhungo
 */
@Aspect
public class QuizAspect {

    private final QuizObserver quizObserver;

    @Autowired
    public QuizAspect(@Qualifier("defaultQuizObserver") QuizObserver quizObserver) {
        this.quizObserver = quizObserver;
    }

    @AfterReturning(pointcut = "execution(* QuizRepository.save(..))", returning = "quiz")
    public void notifyQuizCreated(Quiz quiz) {
        quizObserver.notifyQuizCreated(quiz);
    }

    @AfterReturning(pointcut = "execution(* QuizRepository.update(..))", returning = "quiz")
    public void notifyQuizUpdated(Quiz quiz) {
        quizObserver.notifyQuizUpdated(quiz);
    }

    @AfterReturning(pointcut = "execution(* QuizRepository.delete(..))", returning = "quiz")
    public void notifyQuizDeleted(Quiz quiz) {
        quizObserver.notifyQuizDeleted(quiz);
    }

}

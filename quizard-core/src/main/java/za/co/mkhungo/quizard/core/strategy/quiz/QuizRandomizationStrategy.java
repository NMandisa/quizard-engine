package za.co.mkhungo.quizard.core.strategy.quiz;

import org.springframework.stereotype.Component;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.strategy.RandomizationStrategy;

import java.util.Collections;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class QuizRandomizationStrategy implements RandomizationStrategy<Quiz> {
    /**
     * @param quiz Quiz Entity
     *
     * */
    @Override
    public void randomize(Quiz quiz) {
        Collections.shuffle(quiz.getQuestions());
        quiz.getQuestions().forEach(question -> Collections.shuffle(question.getOptions()));
    }

}

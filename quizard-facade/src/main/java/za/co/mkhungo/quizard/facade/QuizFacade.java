package za.co.mkhungo.quizard.facade;


import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */

public interface QuizFacade {
    Quiz createQuiz(Quiz quiz);
    Quiz updateQuiz(Quiz quiz);
}

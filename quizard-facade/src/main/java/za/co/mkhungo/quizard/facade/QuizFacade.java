package za.co.mkhungo.quizard.facade;


import za.co.mkhungo.quizard.dto.QuizDTO;

/**
 * @author Noxolo.Mkhungo
 */

public interface QuizFacade {
    QuizDTO createQuiz(QuizDTO quizDTO);
    QuizDTO updateQuiz(QuizDTO quizDTO);
}

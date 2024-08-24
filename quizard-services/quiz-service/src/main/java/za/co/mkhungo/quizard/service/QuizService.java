package za.co.mkhungo.quizard.service;

import za.co.mkhungo.quizard.dto.QuizDTO;
import za.co.mkhungo.quizard.response.QuizAnalyticsResponse;
import za.co.mkhungo.quizard.response.QuizResponse;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizService {
    QuizAnalyticsResponse getQuizAnalytics();
    QuizAnalyticsResponse getQuizByIdAnalytics(Long id);
    QuizResponse createQuiz(QuizDTO quizDTO);
}

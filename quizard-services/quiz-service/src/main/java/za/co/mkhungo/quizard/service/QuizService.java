package za.co.mkhungo.quizard.service;

import za.co.mkhungo.quizard.response.QuizAnalyticsResponse;
import za.co.mkhungo.quizard.response.QuizResponse;
import za.co.mkhungo.quizard.vo.QuizVO;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizService {
    QuizAnalyticsResponse getQuizAnalyticsResponse();
    QuizAnalyticsResponse getQuizByIdAnalyticsResponse(Long id);
    QuizResponse createQuiz(QuizVO quizVO);
}

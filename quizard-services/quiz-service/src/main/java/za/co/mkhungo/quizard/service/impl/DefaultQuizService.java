package za.co.mkhungo.quizard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.mkhungo.quizard.facade.QuizFacade;
import za.co.mkhungo.quizard.response.QuizAnalyticsResponse;
import za.co.mkhungo.quizard.response.QuizResponse;
import za.co.mkhungo.quizard.service.QuizService;
import za.co.mkhungo.quizard.vo.QuizVO;

/**
 * @author Noxolo.Mkhungo
 */
@Service
public class DefaultQuizService implements QuizService {

    private final QuizFacade quizFacade;

    @Autowired
    public DefaultQuizService(final QuizFacade quizFacade) {
        this.quizFacade = quizFacade;
    }

    /**
     * @return QuizAnalyticsResponse Quiz Analytics Response
     */
    @Override
    public QuizAnalyticsResponse getQuizAnalyticsResponse() {
        return null;
    }

    /**
     * @return QuizAnalyticsResponse Quiz Analytics Response
     */
    @Override
    public QuizAnalyticsResponse getQuizByIdAnalyticsResponse(Long quizId) {
        return null;
    }

    /**
     * @param quizVO Quiz Value Object
     * @return QuizResponse Quiz Response
     */
    @Override
    public QuizResponse createQuiz(QuizVO quizVO) {
        //quizFacade.createQuiz(quizVO);
        return null;
    }
}

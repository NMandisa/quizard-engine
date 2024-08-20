package za.co.mkhungo.quizard.core.observer;

import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizObserver {
    void notifyQuizCreated(Quiz quiz);
    void notifyQuizUpdated(Quiz quiz);
    void notifyQuizDeleted(Quiz quiz);

}

package za.co.mkhungo.quizard.core.repository.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizSessionRepository extends JpaRepository<QuizSession, Long> {
}

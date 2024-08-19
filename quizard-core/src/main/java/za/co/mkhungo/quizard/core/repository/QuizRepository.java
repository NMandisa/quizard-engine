package za.co.mkhungo.quizard.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}

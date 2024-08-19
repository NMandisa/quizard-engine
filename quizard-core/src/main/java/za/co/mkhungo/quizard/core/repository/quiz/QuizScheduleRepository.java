package za.co.mkhungo.quizard.core.repository.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.quiz.QuizSchedule;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizScheduleRepository extends JpaRepository<QuizSchedule, Long> {
}

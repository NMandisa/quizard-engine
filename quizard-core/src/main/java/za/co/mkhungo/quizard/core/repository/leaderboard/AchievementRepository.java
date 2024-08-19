package za.co.mkhungo.quizard.core.repository.leaderboard;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.leaderboard.Achievement;

/**
 * @author Noxolo.Mkhungo
 */
public interface AchievementRepository extends JpaRepository<Achievement, Long> {
}

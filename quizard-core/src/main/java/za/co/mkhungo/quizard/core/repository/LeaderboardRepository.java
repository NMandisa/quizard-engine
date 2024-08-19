package za.co.mkhungo.quizard.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.Leaderboard;

/**
 * @author Noxolo.Mkhungo
 */
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {
}

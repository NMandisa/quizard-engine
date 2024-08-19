package za.co.mkhungo.quizard.core.repository.configuration;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.configuration.LeaderboardConfiguration;

/**
 * @author Noxolo.Mkhungo
 */
public interface LeaderboardConfigurationRepository extends JpaRepository<LeaderboardConfiguration, Long> {
}

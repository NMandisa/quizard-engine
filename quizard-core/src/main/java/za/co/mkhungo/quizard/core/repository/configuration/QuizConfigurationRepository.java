package za.co.mkhungo.quizard.core.repository.configuration;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.configuration.QuizConfiguration;

/**
 * @author Noxolo.Mkhungo
 */
public interface QuizConfigurationRepository extends JpaRepository<QuizConfiguration, Long> {
}

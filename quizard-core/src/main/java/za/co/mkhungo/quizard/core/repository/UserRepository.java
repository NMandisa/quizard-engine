package za.co.mkhungo.quizard.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.quizard.core.model.User;

/**
 * @author Noxolo.Mkhungo
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
public class AchievementType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

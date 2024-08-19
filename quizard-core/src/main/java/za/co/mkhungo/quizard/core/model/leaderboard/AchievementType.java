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
@Table(name = "achievement_type")
public class AchievementType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_type_id")
    private Long id;

    @Column(name = "achievement_type",nullable = false)
    private String type;

    @Column(name = "achievement_value",nullable = false)
    private String achievementValue;

}

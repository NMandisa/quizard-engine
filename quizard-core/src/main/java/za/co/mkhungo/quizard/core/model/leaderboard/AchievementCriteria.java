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
@Table(name = "Achievement_Criteria", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"achievement_id", "criteria_type", "criteria_value"})
})
public class AchievementCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int achievementCriteriaId;

    @ManyToOne
    @JoinColumn(name = "achievement_id", nullable = false)
    private Achievement achievement;

    @Column(nullable = false)
    private String criteriaType;

    @Column(nullable = false)
    private String criteriaValue;

    @Column(nullable = false)
    private int achievementCriteriaOrder;

    @Column(nullable = false)
    private int achievementCriteriaWeight;
}

package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.leaderboard.achievement.CriteriaType;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "achievement_criteria", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"achievement_id", "criteria_type", "criteria_value"})
})
public class AchievementCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_criteria_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "achievement_id", nullable = false)
    private Achievement achievement;

    @OneToOne
    @JoinColumn(name = "criteria_type_id", nullable = false)
    private CriteriaType criteriaType;

    @Column(nullable = false)
    private int achievementCriteriaOrder;

    @Column(nullable = false)
    private int achievementCriteriaWeight;
}

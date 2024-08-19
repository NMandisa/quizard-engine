package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.leaderboard.achievement.RewardType;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "reward")
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reward_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "reward_type_id", nullable = false)
    private RewardType rewardType;

    @ManyToOne
    @JoinColumn(name = "Achievement_ID")
    private Achievement achievement;
}

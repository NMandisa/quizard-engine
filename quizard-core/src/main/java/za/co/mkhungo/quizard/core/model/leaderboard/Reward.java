package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "reward")
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rewardId;

    @ManyToOne
    @JoinColumn(name = "Achievement_ID")
    private Achievement achievement;

    @Column(name = "Reward_Type")
    private String rewardType;

    @Column(name = "Reward_Data")
    private String rewardData;
}

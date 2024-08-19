package za.co.mkhungo.quizard.core.model.leaderboard.achievement;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@Entity
@Table(name = "reward_type")
public class RewardType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reward_type_id")
    private Long id;

    @Column(name = "reward_type")
    private String type;

    @Column(name = "reward_value")
    private String rewardValue;

}

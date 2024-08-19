package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.User;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "achievement")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "achievement_name")
    private String achievementName;

    @Column(name = "achievement_description")
    private String achievementDescription;

    @OneToOne
    private AchievementType achievementType;

    @OneToMany(mappedBy = "achievement")
    private List<Reward> rewards;
}

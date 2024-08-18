package za.co.mkhungo.quizard.core.model.leaderboard;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.User;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "achievement")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long achievementId;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    @Column(name = "Achievement_Name")
    private String achievementName;

    @Column(name = "Achievement_Description")
    private String achievementDescription;

    @OneToOne
    private AchievementType achievementType;

    @OneToMany(mappedBy = "achievement")
    private List<Reward> rewards;
}

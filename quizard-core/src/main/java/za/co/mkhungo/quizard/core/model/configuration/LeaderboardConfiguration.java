package za.co.mkhungo.quizard.core.model.configuration;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.enums.LeaderboardConfigurationType;
import za.co.mkhungo.quizard.core.model.Leaderboard;

/**
 * @author Noxolo.Mkhungo
 */
public class LeaderboardConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaderboardConfigurationId;

    @ManyToOne
    @JoinColumn(name = "leaderboard_id", nullable = false)
    private Leaderboard leaderboard;

    @Column(nullable = false)
    private String leaderboardConfigurationData;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeaderboardConfigurationType leaderboardConfigurationType;
}

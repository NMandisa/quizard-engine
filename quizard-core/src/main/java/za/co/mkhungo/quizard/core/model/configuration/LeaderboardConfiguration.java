package za.co.mkhungo.quizard.core.model.configuration;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.enums.LeaderboardConfigurationType;
import za.co.mkhungo.quizard.core.model.Leaderboard;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "leaderboard_configuration")
public class LeaderboardConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leaderboard_configuration_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "leaderboard_id", nullable = false)
    private Leaderboard leaderboard;

    @Column(nullable = false)
    private String leaderboardConfigurationData;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeaderboardConfigurationType leaderboardConfigurationType;
}

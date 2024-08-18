package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.model.User;

import java.util.Date;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "quiz_analytics")
public class QuizAnalytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizAnalyticsId;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "start_Time")
    private Date startTime;

    @Column(name = "end_Time")
    private Date endTime;

    @Column(name = "score")
    private Integer score;

    @ManyToMany
    @JoinTable(
            name = "Game_Analytics_Game_Modes",
            joinColumns = @JoinColumn(name = "quiz_analytics_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_mode_id")
    )
    private List<QuizMode> quizModes;
}

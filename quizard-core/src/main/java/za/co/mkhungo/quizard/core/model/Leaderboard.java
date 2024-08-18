package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "Leaderboard")
public class Leaderboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaderboardId;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "Score")
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "quiz_session_id")
    private QuizSession quizSession;

    @Column(name = "rank")
    private Integer rank;
}

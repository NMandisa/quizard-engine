package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.enums.SessionStatus;
import za.co.mkhungo.quizard.core.model.Leaderboard;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.model.User;

import java.util.Date;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz_session", indexes = {
        @Index(name = "idx_user_id", columnList = "user_id"),
        @Index(name = "idx_quiz_id", columnList = "quiz_id")
}, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "quiz_id", "status"})
})
public class QuizSession {

     //Added status (Enum: In Progress, Completed, Abandoned) to track session status
    //Added duration (Integer) to store the duration of the session
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int quizSessionId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @Column(nullable = false)
    private Date startTime;

    @Column(nullable = true)
    private Date endTime;

    @Column(nullable = true)
    private int score;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SessionStatus status;

    @Column(nullable = true)
    private int duration;

    @OneToMany(mappedBy = "quizSession")
    private List<Leaderboard> leaderboards;

}

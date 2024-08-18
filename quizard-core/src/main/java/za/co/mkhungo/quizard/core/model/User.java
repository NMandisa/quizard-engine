package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.leaderboard.Achievement;
import za.co.mkhungo.quizard.core.model.quiz.Answer;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Email")
    private String email;

    @OneToMany(mappedBy = "createdBy")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "user")
    private List<Answer> answers;

    @OneToMany(mappedBy = "user")
    private List<QuizSession> quizSessions;

    @OneToMany(mappedBy = "user")
    private List<Achievement> achievements;
}

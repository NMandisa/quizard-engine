package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.leaderboard.Achievement;
import za.co.mkhungo.quizard.core.model.quiz.Answer;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
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

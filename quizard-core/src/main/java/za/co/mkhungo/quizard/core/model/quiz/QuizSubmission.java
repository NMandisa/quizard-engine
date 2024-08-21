package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
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
@Table(name = "quiz_submissions")
public class QuizSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_submission_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "quiz_submission_time")
    private Date submissionTime;
    @Column(name = "quiz_score")
    private Integer score;

    @OneToMany(mappedBy = "quizSubmission")
    private List<QuestionSubmission> questionSubmissions;

}

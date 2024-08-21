package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */

@Getter
@Setter
@Entity
@Table(name = "question_submissions")
public class QuestionSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "quiz_submission_id")
    private QuizSubmission quizSubmission;

    @ManyToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;

    private String userAnswer;

    private Boolean correct;



}

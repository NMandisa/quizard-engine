package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.User;
import za.co.mkhungo.quizard.core.model.quiz.question.Option;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz_answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "answer_text")
    private String text;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @OneToMany(mappedBy = "answer")
    private List<QuestionSubmission> quizSubmission;

}

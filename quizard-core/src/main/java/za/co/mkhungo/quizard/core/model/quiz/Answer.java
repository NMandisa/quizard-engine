package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.Question;
import za.co.mkhungo.quizard.core.model.User;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "answer_text")
    private String answerText;
}

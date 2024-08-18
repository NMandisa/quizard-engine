package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "question_options", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"question_id", "option_order"})
})
public class QuestionOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionOptionId;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(nullable = false)
    private String optionText;

    @Column(nullable = false)
    private boolean isCorrectAnswer;

    @Column(nullable = false)
    private int optionOrder;
}

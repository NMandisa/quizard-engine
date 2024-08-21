package za.co.mkhungo.quizard.core.model.quiz.question;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.quiz.Answer;
import za.co.mkhungo.quizard.core.model.quiz.Question;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "question_options", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"question_id", "option_order"})
})
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @OneToMany(mappedBy = "option")
    private List<Answer> answers;

    @Column(nullable = false)
    private String optionText;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @Column(nullable = false)
    private int optionOrder;
}

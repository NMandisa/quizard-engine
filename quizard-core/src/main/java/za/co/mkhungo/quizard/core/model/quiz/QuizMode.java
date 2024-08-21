package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.enums.quiz.mode.Mode;
import za.co.mkhungo.quizard.core.model.Quiz;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz_modes")
public class QuizMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_mode_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode")
    private Mode mode;

    @OneToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

}

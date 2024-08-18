package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */

@Entity
@Table(name = "quiz_modes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"quiz_mode_name"})
})
public class QuizMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizModeId;

    @Column(name = "quiz_mode_name")
    private String quizModeName;
    @OneToOne
    private QuizModeCategory quizModeCategory;


}

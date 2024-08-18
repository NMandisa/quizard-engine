package za.co.mkhungo.quizard.core.model.configuration;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.enums.QuizConfigurationType;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.model.quiz.QuizMode;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "quiz_configurations", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"quiz_id", "quiz_mode_id", "quiz_configuration_type"})
})
public class QuizConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizConfigurationId;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "quiz_mode_id", nullable = false)
    private QuizMode quizMode;

    @Column(nullable = false)
    private String quizConfigurationData;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuizConfigurationType quizConfigurationType;
}

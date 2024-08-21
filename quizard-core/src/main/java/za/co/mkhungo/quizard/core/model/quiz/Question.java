package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.enums.quiz.QuestionType;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.model.quiz.question.Option;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @OneToMany(mappedBy = "question")
    private List<Option> options;

    @Enumerated(EnumType.STRING)
    @Column(name = "question_type")
    private QuestionType type;

    @Column(name = "question_text")
    private String text;

    @Column(name = "correct_answer_explained")
    private String correctAnswerExplained;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @Column(name = "multi_correct")
    private Boolean multiCorrect;
}

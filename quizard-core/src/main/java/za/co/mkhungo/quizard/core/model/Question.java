package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.quiz.Answer;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @ManyToOne
    @JoinColumn(name = "Quiz_ID")
    private Quiz quiz;

    @Column(name = "Question_Text")
    private String questionText;

    @OneToMany(mappedBy = "question")
    private List<QuestionOption> options;

    @Column(name = "Correct_Answer")
    private String correctAnswer;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}

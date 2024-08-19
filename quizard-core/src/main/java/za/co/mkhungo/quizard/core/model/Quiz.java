package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.quiz.Answer;
import za.co.mkhungo.quizard.core.model.quiz.Category;
import za.co.mkhungo.quizard.core.model.quiz.Question;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "created_By")
    private User createdBy;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    @OneToMany(mappedBy = "quiz")
    private List<QuizSession> gameSession;

    @OneToMany(mappedBy = "quiz")
    private List<Answer> answers;
}

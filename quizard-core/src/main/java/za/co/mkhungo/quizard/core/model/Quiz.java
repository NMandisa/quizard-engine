package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.quiz.Category;
import za.co.mkhungo.quizard.core.model.quiz.QuizSession;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
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
    @JoinColumn(name = "category_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "created_By")
    private User createdBy;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    @OneToMany(mappedBy = "quiz")
    private List<QuizSession> gameSession;
}

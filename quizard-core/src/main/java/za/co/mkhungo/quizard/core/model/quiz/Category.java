package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.Quiz;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "quiz_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "Category_Name")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Quiz> quizzes;
}

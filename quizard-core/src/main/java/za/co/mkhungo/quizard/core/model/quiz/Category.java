package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.Quiz;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Quiz> quizzes;
}

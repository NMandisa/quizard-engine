package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.quiz.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "quiz")
public class Quiz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;

    @OneToOne
    private QuizMode mode;

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
    private List<QuizSession> quizSessions;

    @OneToMany(mappedBy = "quiz")
    private List<QuizSubmission> quizSubmissions;



}

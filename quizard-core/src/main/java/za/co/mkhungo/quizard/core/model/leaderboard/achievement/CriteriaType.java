package za.co.mkhungo.quizard.core.model.leaderboard.achievement;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "criteria_type")
public class CriteriaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="criteria_type_id")
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String criteriaValue;
}

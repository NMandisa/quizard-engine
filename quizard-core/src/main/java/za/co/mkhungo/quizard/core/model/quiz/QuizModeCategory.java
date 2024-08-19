package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
public class QuizModeCategory {
   // (e.g., Solo, Multiplayer)
   //Added game_mode_category (String) to categorize game modes (e.g., Solo, Multiplayer)
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long quizModeCategoryId;

   private String modeCategory;
}

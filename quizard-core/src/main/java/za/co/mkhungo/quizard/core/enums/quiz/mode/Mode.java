package za.co.mkhungo.quizard.core.enums.quiz.mode;

import lombok.Getter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
public enum Mode {
   TIMED_MODE("Timed Mode"),UNTIMED_MODE("UnTimed Mode"), MULTIPLE_CHOICE_MODE("Multiple Choice Mode"),
   OPEN_ENDED_MODE("Open Ended Mode"),ADAPTIVE_MODE("Adaptive_Mode"),MULTI_QUESTION_MODE("Multi Question Mode"),
   GAME_MODE("Game Mode"),SIMULATION_MODE("Simulation Mode"),REVIEW_MODE("Review Mode"),ASSESSMENT_MODE("Assessment Mode");
   private final String quizMode;
   Mode(String value) {
      this.quizMode = value;
   }

}

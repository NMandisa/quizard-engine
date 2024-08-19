package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.quiz.QuizSchedule;

import java.sql.Time;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "Reminders")
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reminder_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quiz_schedule_id")
    private QuizSchedule quizSchedule;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "reminder_yype_id")
    private ReminderType reminderType;

    @Column(name = "reminder_scheduled_time")
    private Time reminderScheduledTime;
}

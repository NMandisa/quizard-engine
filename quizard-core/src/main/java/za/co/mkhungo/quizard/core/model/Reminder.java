package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import za.co.mkhungo.quizard.core.model.quiz.QuizSchedule;

import java.sql.Time;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "Reminders")
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderId;

    @ManyToOne
    @JoinColumn(name = "Quiz_Schedule_ID")
    private QuizSchedule quizSchedule;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Reminder_Type_ID")
    private ReminderType reminderType;

    @Column(name = "Reminder_Scheduled_Time")
    private Time reminderScheduledTime;
}

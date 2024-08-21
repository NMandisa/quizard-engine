package za.co.mkhungo.quizard.core.model.quiz;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mkhungo.quizard.core.model.Quiz;
import za.co.mkhungo.quizard.core.model.Reminder;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "Quiz_Schedules")
public class QuizSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_schedule_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Quiz_ID")
    private Quiz quiz;

    @Column(name = "Schedule_Date")
    private Date scheduleDate;

    @Column(name = "Schedule_Time")
    private Time scheduleTime;

    @OneToMany(mappedBy = "quizSchedule")
    private List<Reminder> reminders;
}

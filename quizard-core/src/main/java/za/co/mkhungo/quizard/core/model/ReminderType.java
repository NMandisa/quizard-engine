package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */

@Entity
@Table(name = "Reminder_Types")
public class ReminderType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderTypeId;

    @Column(name = "Reminder_Type_Name")
    private String reminderTypeName;
}

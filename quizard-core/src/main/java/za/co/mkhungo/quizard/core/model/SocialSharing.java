package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;

import java.util.Date;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "Social_Sharing")
public class SocialSharing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long socialSharingId;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Quiz_ID")
    private Quiz quiz;

    @Column(name = "Share_Date")
    private Date shareDate;

    @ManyToOne
    @JoinColumn(name = "Share_Platform_ID")
    private SharePlatform sharePlatform;
}

package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */

@Entity
@Table(name = "Share_Platforms")
public class SharePlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sharePlatformId;

    @Column(name = "Share_Platform_Name")
    private String sharePlatformName;
}

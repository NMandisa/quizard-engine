package za.co.mkhungo.quizard.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@Table(name = "share_platforms")
public class SharePlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "share_platform_id")
    private Long id;

    @Column(name = "Share_Platform_Name")
    private String sharePlatformName;
}

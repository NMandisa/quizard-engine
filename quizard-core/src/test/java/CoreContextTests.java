import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Noxolo.Mkhungo
 */

@Slf4j
@SpringJUnitConfig
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:/META-INF/core-context.xml")
class CoreContextTests {

    @Test
    @DisplayName("Core Context Load Test")
    void contextLoads() {
    }
}

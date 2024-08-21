package za.co.mkhungo.quizard.core.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.annotation.Rollback;
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
@Rollback(value = false)
public class QuizRepositoryTests {
}

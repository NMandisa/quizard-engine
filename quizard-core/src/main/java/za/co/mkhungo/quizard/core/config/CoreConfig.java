package za.co.mkhungo.quizard.core.config;

/**
 * @author Noxolo.Mkhungo
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

@Configuration
public class CoreConfig {

    @Bean
    public RetryTemplate retryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();
        FixedBackOffPolicy fixedBackoffPolicy = new FixedBackOffPolicy();
        fixedBackoffPolicy.setBackOffPeriod(5000L); // 5-second interval
        retryTemplate.setBackOffPolicy(fixedBackoffPolicy);
        SimpleRetryPolicy simpleRetryPolicy = new SimpleRetryPolicy(3); // 3 attempts
        retryTemplate.setRetryPolicy(simpleRetryPolicy);
        return retryTemplate;
    }
}

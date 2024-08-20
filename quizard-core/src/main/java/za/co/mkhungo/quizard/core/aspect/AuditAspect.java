package za.co.mkhungo.quizard.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Noxolo.Mkhungo
 */
@Aspect
public class AuditAspect {
    @Around("execution(* QuizFacade.*(..))")
    public Object logAuditInformation(ProceedingJoinPoint joinPoint) throws Throwable {
        // Log audit information (e.g., user, timestamp, action)
        return joinPoint.proceed();
    }
}

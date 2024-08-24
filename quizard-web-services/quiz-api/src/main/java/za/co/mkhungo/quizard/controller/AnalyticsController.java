package za.co.mkhungo.quizard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.quizard.response.QuizAnalyticsResponse;
import za.co.mkhungo.quizard.service.QuizService;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
public class AnalyticsController extends QuizRootController{

    private final QuizService quizService;

    @Autowired
    public AnalyticsController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/analytics")
    public ResponseEntity<QuizAnalyticsResponse> getAnalytics(){
        return ResponseEntity.ok(quizService.getQuizAnalytics());
    }

    @PostMapping("{id}/analytics")
    public ResponseEntity<QuizAnalyticsResponse> getAnalytics(@PathVariable("id") Long quizId){
        return ResponseEntity.ok(quizService.getQuizByIdAnalytics(quizId));
    }
}

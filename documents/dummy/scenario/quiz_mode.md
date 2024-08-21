# Quiz Mode 

### Example 1: Timed Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "timed",
    "duration": 30,
    "questions": [...]
  }
}
```

### Example 2: Untimed Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "untimed",
    "questions": [...]
  }
}
```

### Example 3: Multiple Choice Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "multiple_choice",
    "questions": [
      {
        "question_id": 1,
        "options": [
          {"text": "Option A", "correct": true},
          {"text": "Option B", "correct": false}
        ]
      }
    ]
  }
}
```
### Example 4: True/False Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "true_false",
    "questions": [
      {
        "question_id": 1,
        "correct_answer": true
      }
    ]
  }
}
```
### Example 5: Open-Ended Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "open_ended",
    "questions": [
      {
        "question_id": 1,
        "prompt": "Describe the significance of the American Revolution."
      }
    ]
  }
}
```
### Example 6: Multi-Question Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "multi_question",
    "questions": [
      {
        "question_id": 1,
        "type": "multiple_choice",
        "options": [...]
      },
      {
        "question_id": 2,
        "type": "true_false",
        "correct_answer": true
      }
    ]
  }
}
```
### Example 7: Adaptive Quiz
```
{
  "quiz_id": 123,
  "title": "History Quiz",
  "mode": {
    "type": "adaptive",
    "questions": [...],
    "rules": [
      {
        "condition": "score > 80",
        "action": "skip_to_question_5"
      }
    ]
  }
}
```
These examples demonstrate different types of quiz modes, including timed, untimed, multiple choice, true/false, open-ended, multi-question, and adaptive quizzes.
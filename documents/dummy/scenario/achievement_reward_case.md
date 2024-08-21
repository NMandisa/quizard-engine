

- quiz_achievement contains quiz_achievement_type
- quiz_achievement_type contains a list of quiz_achievement_criteria and a single quiz_reward
- quiz_achievement_criteria contains quiz_achievement_criteria_type
- quiz_reward contains quiz_reward_type

```
{
  "quiz_achievement": {
    "id": 1,
    "name": "Quiz Achievement 1",
    "quiz_achievement_type": {
      "id": 1,
      "name": "Type 1",
      "quiz_achievement_criteria": [
        {
          "id": 1,
          "name": "Criteria 1",
          "quiz_achievement_criteria_type": {
            "id": 1,
            "name": "Criteria Type 1"
          }
        },
        {
          "id": 2,
          "name": "Criteria 2",
          "quiz_achievement_criteria_type": {
            "id": 2,
            "name": "Criteria Type 2"
          }
        }
      ],
      "quiz_reward": {
        "id": 1,
        "name": "Reward 1",
        "quiz_reward_type": {
          "id": 1,
          "name": "Reward Type 1"
        }
      }
    }
  }
}
```

In this example:

- The quiz_achievement is "Quiz Master"
- The quiz_achievement_type is "Score Based"
- The quiz_achievement_criteria are:
- "Score 80%" with type "Percentage"
- "Complete within 30 minutes" with type "Time"
- The quiz_reward is "Bronze Medal" with type "Badge"

This data represents a quiz achievement that requires scoring 80% and completing the quiz within 30 minutes to earn a Bronze Medal badge.

```
{
  "quiz_achievement": {
    "id": 1,
    "name": "Quiz Master",
    "quiz_achievement_type": {
      "id": 1,
      "name": "Score Based",
      "quiz_achievement_criteria": [
        {
          "id": 1,
          "name": "Score 80%",
          "quiz_achievement_criteria_type": {
            "id": 1,
            "name": "Percentage"
          }
        },
        {
          "id": 2,
          "name": "Complete within 30 minutes",
          "quiz_achievement_criteria_type": {
            "id": 2,
            "name": "Time"
          }
        }
      ],
      "quiz_reward": {
        "id": 1,
        "name": "Bronze Medal",
        "quiz_reward_type": {
          "id": 1,
          "name": "Badge"
        }
      }
    }
  }
}
```

These examples demonstrate different types of quiz achievements, such as:

- Streak-based achievements (e.g., completing a quiz for 5 consecutive days)
- Accuracy-based achievements (e.g., achieving 95% accuracy)
- Score-based achievements with different criteria (e.g., earning 500 points)

Each achievement has a corresponding reward, such as a badge or exclusive content.
Here are a few more examples of quiz achievements with different criteria and rewards:

```
{
  "quiz_achievement": {
    "id": 2,
    "name": "Quiz Whiz",
    "quiz_achievement_type": {
      "id": 2,
      "name": "Streak Based",
      "quiz_achievement_criteria": [
        {
          "id": 3,
          "name": "5 Day Streak",
          "quiz_achievement_criteria_type": {
            "id": 3,
            "name": "Days"
          }
        }
      ],
      "quiz_reward": {
        "id": 2,
        "name": "Silver Medal",
        "quiz_reward_type": {
          "id": 1,
          "name": "Badge"
        }
      }
    }
  }
}

{
  "quiz_achievement": {
    "id": 3,
    "name": "Quiz Expert",
    "quiz_achievement_type": {
      "id": 3,
      "name": "Accuracy Based",
      "quiz_achievement_criteria": [
        {
          "id": 4,
          "name": "95% Accuracy",
          "quiz_achievement_criteria_type": {
            "id": 1,
            "name": "Percentage"
          }
        }
      ],
      "quiz_reward": {
        "id": 3,
        "name": "Gold Medal",
        "quiz_reward_type": {
          "id": 1,
          "name": "Badge"
        }
      }
    }
  }
}

{
  "quiz_achievement": {
    "id": 4,
    "name": "Quiz Enthusiast",
    "quiz_achievement_type": {
      "id": 1,
      "name": "Score Based",
      "quiz_achievement_criteria": [
        {
          "id": 5,
          "name": "500 Points",
          "quiz_achievement_criteria_type": {
            "id": 4,
            "name": "Points"
          }
        }
      ],
      "quiz_reward": {
        "id": 4,
        "name": "Exclusive Content",
        "quiz_reward_type": {
          "id": 2,
          "name": "Content"
        }
      }
    }
  }
}
```


```

```
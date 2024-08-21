## Quiz Analytics

Example 1: Score Distribution

{
"quiz_id": 123,
"title": "History Quiz",
"analytics": {
"score_distribution": {
"average_score": 80,
"high_score": 95,
"low_score": 60,
"score_ranges": [
{
"range": "60-70",
"count": 10
},
{
"range": "70-80",
"count": 20
},
{
"range": "80-90",
"count": 15
}
]
}
}
}


Example 2: Question Performance

{
"quiz_id": 123,
"title": "History Quiz",
"analytics": {
"question_performance": [
{
"question_id": 1,
"correct_answers": 25,
"incorrect_answers": 10,
"accuracy": 0.71
},
{
"question_id": 2,
"correct_answers": 30,
"incorrect_answers": 5,
"accuracy": 0.86
}
]
}
}


Example 3: User Performance

{
"quiz_id": 123,
"title": "History Quiz",
"analytics": {
"user_performance": [
{
"user_id": 1,
"score": 85,
"time_taken": 25
},
{
"user_id": 2,
"score": 90,
"time_taken": 30
}
]
}
}


Example 4: Category Performance

{
"quiz_id": 123,
"title": "History Quiz",
"analytics": {
"category_performance": [
{
"category": "World History",
"average_score": 80,
"high_score": 95,
"low_score": 60
},
{
"category": "US History",
"average_score": 85,
"high_score": 98,
"low_score": 70
}
]
}
}


Example 5: Time-Based Performance

{
"quiz_id": 123,
"title": "History Quiz",
"analytics": {
"time_based_performance": [
{
"time_range": "0-15 minutes",
"average_score": 75,
"high_score": 90,
"low_score": 60
},
{
"time_range": "15-30 minutes",
"average_score": 85,
"high_score": 95,
"low_score": 70
}
]
}
}


These examples demonstrate different types of quiz analytics data, including score distribution, question performance, user performance, category performance, and time-based performance.
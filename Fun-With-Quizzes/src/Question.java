public class Question {
    private String questions;
    private String answers;
    private int score;

    public Question(String questions, String answers, int score) {
        this.questions = questions;
        this.answers = answers;
        this.score = score;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void displayQuestions(){

    }

//    public int correctAnswer(){
//        if(answers == true){
//            score = +1;
//        }
//        return score;
   // }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MultipleChoice extends Question {


    public MultipleChoice(String questions, String answers, int score) {
        super(questions, answers, score);
    }

    public static void questionList(){
        Question one = new Question("How many sides does a square have?", "A: 3  B:5 C:4", )
    }
}




//    public static ArrayList<String> findAll(String field) {
//
//        // load data, if not already loaded
//        loadData();
//
//        ArrayList<String> values = new ArrayList<>();
//
//        for (HashMap<String, String> row : allJobs) {
//            String aValue = row.get(field);
//
//            if (!values.contains(aValue)) {
//                values.add(aValue);
//            }
//        }
//
//        return values;
//    }
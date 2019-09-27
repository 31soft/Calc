import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InputPharser {
    private String input;
    public boolean isCorrectPharsing;
    {
        isCorrectPharsing = false;
    }


    HashMap<SubjectsEnum, String> map = new HashMap<>();

    public InputPharser(){
        input = "";
    }

    private boolean isCorrectInput(){
        String[] strArr = input.split(" ");
        if (strArr.length != 3) return false;
        if (!isOperator(strArr[1])) return false;
        else return true;
    }

    public boolean readInput() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
           // e.printStackTrace();
            return false;
        }
        return isCorrectInput();
    }

     private boolean isOperator(String st){
        HashSet<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        return set.contains(st);
    }


    public HashMap<SubjectsEnum, String> pharse() {
        String[] strArr = input.split(" ");
        map.clear();
        if (strArr.length != 3) isCorrectPharsing = false;
        else {
            isCorrectPharsing = true;
            map.put(SubjectsEnum.TERM1, strArr[0]);
            map.put(SubjectsEnum.OPERATOR, strArr[1]);
            map.put(SubjectsEnum.TERM2, strArr[2]);
        }
        return map;
    }
}

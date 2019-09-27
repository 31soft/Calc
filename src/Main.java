import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        InputPharser inputPharser = new InputPharser();
       if (!inputPharser.readInput()) {
            System.out.println("Ошибка! Введенные данные некорректны!");
       }

       HashMap<SubjectsEnum, String> map = inputPharser.pharse();

       if (inputPharser.isCorrectPharsing) {
            String term1 = map.get(SubjectsEnum.TERM1);
            String term2 = map.get(SubjectsEnum.TERM2);
            String operator = map.get(SubjectsEnum.OPERATOR);

            Calc calc = new Calc();

            if (operator.equals("+")) {
                System.out.println("Add : " + calc.doAdd(term1, term2));
            } else if (operator.equals("-")) {
                System.out.println("Subtract : " + calc.doSubtract(term1, term2));
            } else if (operator.equals("*")) {
                System.out.println("Multiply : " + calc.doMultiply(term1, term2));
            } else if (operator.equals("/")) {
                System.out.println("Divide : " + calc.doDivide(term1, term2));
            }
        }

    }
}

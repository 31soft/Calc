import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Calc implements CalcOptions {
    public static boolean isArabic(String st){
        HashSet<String> set = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        return set.contains(st);
    }

    public static boolean isRoman(String st){
        HashSet<String> set = new HashSet<>(Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
        return set.contains(st);
    }

    public int toArabic(String stArab){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        return map.get(stArab);
    }

    public String doAddRoman(String term1, String term2){
        return RomanNumber.toRoman(toArabic(term1) + toArabic(term2));
    }

    public String doAddArabic(String term1, String term2){
        return String.valueOf(Integer.parseInt(term1) + Integer.parseInt(term1));
    }

    public String doAdd(String term1, String term2){
        if (isArabic(term1) && isArabic(term2)) return doAddArabic(term1, term2);
        else if (isRoman(term1) && isRoman(term2)) return doAddRoman(term1, term2);
        else{
            System.out.println("Введены некорректнрые числа!");
            return "";
        }
    }

    public String doSubtractRoman(String term1, String term2){
        return RomanNumber.toRoman(toArabic(term1) - toArabic(term2));
    }

    public String doSubtractArabic(String term1, String term2){
        return  String.valueOf(Integer.parseInt(term1) - Integer.parseInt(term2));
    }
    public String doSubtract(String term1, String term2){
        if (isArabic(term1) && isArabic(term2)) return doSubtractArabic(term1, term2);
        else if (isRoman(term1) && isRoman(term2)) return doSubtractRoman(term1, term2);
        else{
            System.out.println("Введены некорректнрые числа!");
            return "";
        }
    }


    public String doMultiplyRoman(String term1, String term2){
        return RomanNumber.toRoman(toArabic(term1) * toArabic(term2));
    }

    public String doMultiplyArabic(String term1, String term2){
        return  String.valueOf(Integer.parseInt(term1) * Integer.parseInt(term2));
    }
    public String doMultiply(String term1, String term2){
        if (isArabic(term1) && isArabic(term2)) return doMultiplyArabic(term1, term2);
        else if (isRoman(term1) && isRoman(term2)) return doMultiplyRoman(term1, term2);
        else{
            System.out.println("Введены некорректнрые числа!");
            return "";
        }
    }

    public String doDivideRoman(String term1, String term2){
        return RomanNumber.toRoman(toArabic(term1) / toArabic(term2));
    }

    public String doDivideArabic(String term1, String term2){
        return  String.valueOf(Integer.parseInt(term1) / Integer.parseInt(term2));
    }
    public String doDivide(String term1, String term2){
        if (isArabic(term1) && isArabic(term2)) return doDivideArabic(term1, term2);
        else if (isRoman(term1) && isRoman(term2)) return doDivideRoman(term1, term2);
        else{
            System.out.println("Введены некорректнрые числа!");
            return "";
        }
    }

}

package tdd.exercises.java;

import java.util.HashMap;

public class RomanToDecimal {



    public int convert(String roman){
        HashMap<Character, Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int result = 0;
        for(int i = 0; i < roman.length() -1 ;i++){
            System.out.println(roman.charAt(i));
//            System.out.println(map.get(roman.charAt(i)));
//            System.out.println(map);
//            System.out.println(map.get(roman.charAt(i)));
            if(map.containsKey(roman.charAt(i)) ) {
                if (map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {

                    result -= map.get(roman.charAt(i));
                } else {
                    result += map.get(roman.charAt(i));
                }
            }
        }
        result+= map.get(roman.charAt(roman.length() - 1));
        return result;
    }

}

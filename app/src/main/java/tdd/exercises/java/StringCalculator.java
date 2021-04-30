package tdd.exercises.java;

public class StringCalculator {

    public int add(String nums) throws Exception {
        if(nums ==  "") return 0;

        String replace = nums.replaceAll("\\D+",",");

        String[] array = replace.split(",");

        int total = 0;
        for(int i = 0; i< array.length; i++){

            if( array[i] == ""){
                continue;
            }
            if(Integer.parseInt(array[i]) < 0) {
                throw new Exception("negatives not allowed");
            }
            System.out.println(array[i]);
            total += Integer.parseInt(array[i]);

        }
        return total;
    }
}

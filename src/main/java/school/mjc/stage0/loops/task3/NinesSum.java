package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        for (int i =1; i<=lengthOfLastNumber; i++){
            String nine = "";
            for (int j =0; j<i; j++){
                nine += "9";
            }
            result += Integer.parseInt(nine);
        }
        System.out.println(result);
    }
}

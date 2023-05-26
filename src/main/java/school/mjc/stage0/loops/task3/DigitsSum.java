package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int value = t;
        String str = Integer.toString(value);
        int result =0;
        for(int i = str.length(); i>1;i--){
            //89
            int pow = (int) Math.pow(10,i-1);
            int r = value/pow;
            value =t%pow;
            result += r;
        }
        result += value;
        System.out.println(Math.abs(result));


    }
}

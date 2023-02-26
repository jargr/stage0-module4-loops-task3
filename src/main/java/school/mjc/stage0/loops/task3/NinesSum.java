package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int n = 9;
            for (int j = 2; j <= i; j++) {
                n = n * 10 + 9;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}

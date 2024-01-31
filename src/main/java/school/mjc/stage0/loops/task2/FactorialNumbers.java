package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive!=0) {
            System.out.println(1);
            int cnt = 1;
            int sum = 1;
            while (cnt <= printToInclusive) {
                sum *= cnt;
                cnt++;
                System.out.println(sum);
            }
        }
        else{
            System.out.println(1);
        }

    }
}

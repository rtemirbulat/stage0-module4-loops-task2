package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power>0) {
            int cnt = 0;
            System.out.println(1);
            int result=1;
            while (cnt < power) {
                result *= 2;
                cnt++;
                System.out.println(result);
            }

        }
        else if(power==0) System.out.println(1);
        else System.out.println("too much power");
    }
}

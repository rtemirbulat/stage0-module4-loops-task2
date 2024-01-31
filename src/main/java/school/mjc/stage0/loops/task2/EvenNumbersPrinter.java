package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int cnt = 0;
        while(cnt<=printTillInclusive){
            if(cnt%2==0) System.out.println(cnt);
            cnt++;
        }
    }
}

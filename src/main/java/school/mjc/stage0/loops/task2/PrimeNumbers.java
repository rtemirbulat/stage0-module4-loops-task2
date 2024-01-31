package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for (int i = 0; i < printToInclusive; i++) {
            boolean prime = true;
            switch(i){
                case 0:
                case 1:
                    prime = false;
                    break;
            }
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    prime = false;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}

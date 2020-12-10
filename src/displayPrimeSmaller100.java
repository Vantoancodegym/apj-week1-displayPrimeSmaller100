import java.util.Scanner;

public class displayPrimeSmaller100 {
    public static void main(String[] args) {
        int number = 2;
        while (number<100){
            if (checkPrime(number)){
                System.out.println(number);
            }
            number++;
        }

    }
    public static boolean checkPrime(int number){
        if (number<=1){
            return false;
        }else if(number==2){
            return true;
        }else if (number>2){
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}

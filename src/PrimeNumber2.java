import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Input a number");
        num= input.nextInt();
        boolean number = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                number = true;
                break;
            }
        }

        if (!number)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");


    }


}



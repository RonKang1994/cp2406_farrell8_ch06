import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args)
    {
        int num = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a new Number ");
        num = input.nextInt();
        while (num != 999){
            if (num % 2 == 1) {
                System.out.println("ERROR");
                System.out.print("Input a new Number ");
                num = input.nextInt();
            }
            else {
                System.out.println("Good Job!");
                System.out.print("Input a new Number ");
                num = input.nextInt();
            }
        }

    }
}

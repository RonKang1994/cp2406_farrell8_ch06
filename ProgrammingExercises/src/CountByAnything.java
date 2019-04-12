import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {
        int count = 0;
        int skip = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("We will count by ");
        count = input.nextInt();
        for (int i = count; i <= 300; i += count){
            if (skip % 10 == 0)
            {
                System.out.println(i + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
            skip += 1;
        }
    }
}

public class CountByThrees {
    public static void main(String[] args)
    {
        int count = 3;
        for (count = 3; count <= 300; count += 3){
            if (count % 30 == 0)
            {
                System.out.println(count + " ");
            }
            else
            {
                System.out.print(count + " ");
            }
        }
    }
}

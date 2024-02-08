import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n natural number :");
        int j=sc.nextInt();
        int sum=0;
        for(int i=1;i<=j;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of first "+j+" natural numbers is:"+sum);
    }
}

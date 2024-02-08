import java.util.Scanner;

public class sumofnuminrange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1=sc.nextInt();
        System.out.println();
        System.out.print("Enter the Second number :");
        int num2=sc.nextInt();
        int sum=0;
        System.out.println();
        for(int i=num1;i<=num2 ; i++)
        {
            sum+=i;
        }
        System.out.println("the sum of numbers from "+num1+" to "+num2+" is : "+sum);
    }
}

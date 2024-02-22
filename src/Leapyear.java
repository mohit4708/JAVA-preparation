import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year :");
        int l=sc.nextInt();
        System.out.println();
        if (l % 4 == 0||l%400==0)
        {
            System.out.println("The entered year is a Leap year");
        }
        else{
            System.out.println("The entered year is not a leap year");
        }

    }
}

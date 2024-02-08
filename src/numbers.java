import java.util.Scanner;

public class numbers {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("The provided input number is positive");
        }
        else if(n<0){
            System.out.println("The provided input number is negative");
        }
        else{
            System.out.println("the provided input number is zero");
        }
    }
}

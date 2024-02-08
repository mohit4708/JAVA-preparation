import java.util.Scanner;

public class evenodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int m=sc.nextInt();
        if(m%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is Odd");
        }
    }
}

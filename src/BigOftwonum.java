import java.util.Scanner;

public class BigOftwonum {
    public void main(String[] args)
    {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+ " is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
}

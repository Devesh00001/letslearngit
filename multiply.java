import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number that you want to multiply: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int m = a * b;
        System.out.println("the multiplication of "+a +" and " + b + " is : "+m);
    }
}



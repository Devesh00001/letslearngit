import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number that you want to add: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a+b;
        System.out.println("the sum of "+a +" and " + b + " is : "+sum);
    }
}

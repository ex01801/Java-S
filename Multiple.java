import java.util.Scanner;
public class Multiple
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = sc.nextInt();

        if (num1 % num2 ==0){
            System.out.println("The first is a multiple of the second");
        }else {
            System.out.println("The first is not a multiple of the second");
        }

    }
}

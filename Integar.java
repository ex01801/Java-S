import java.util.Scanner;
public class Integar
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();

        if (number >= 0){
            System.out.println("positive");
        } else {
            System.out.println("not positive");
        }

     
     
    }
}

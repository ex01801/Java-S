import java.util.Scanner;
public class Larger
{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int num1 = sc.nextInt();
    System.out.println("Please enter another number");
    int num2 = sc.nextInt();
    
    if (num1 > num2){
        System.out.println("The larger number is "+ num1);
        
    }else {
    System.out.println("The larger number is "+ num2);
    }
    
    
    
    
    
    
    }
}

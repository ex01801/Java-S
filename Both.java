import java.util.Scanner;
public class Both
{
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int num1 = sc.nextInt();
    System.out.println("Please enter another number:");
    int num2 = sc.nextInt();
    
    if (num1 % 2 ==0 & num2 % 2 == 0){
        System.out.println("Both are even");
    }else if (num1 %2 != 0 & num2 %2 !=0){
       System.out.println("Both are odd");
    }else {
    System.out.println("One is odd and the other is even");
    }
    
    
    
    
    
    
    }
}


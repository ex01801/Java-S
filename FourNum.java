import java.util.Scanner;
public class FourNum
{
  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter four number");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
     
      int min = a;
      if (b < min){
        min = b;
        }
       if (c < min){
        min = c;
        }
       if (d < min){
        min = d;
        }
        
        int lag = a;
      if (b > lag){
        lag = b;
        }
       if (c > lag){
        lag = c;
        }
       if (d > lag){
        lag = d;
        }
      System.out.println("Smallest is "+ min);
       System.out.println("Largest is "+ lag);
      
      
          
    }
}

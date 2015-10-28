import java.util.Scanner;
public class QQ3
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [5];
        System.out.println(a);
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Please enter a integer value:");
            a[i] = sc.nextInt();
        }
      
        double sum = 0;
        for (int i = 0; i < a.length; i++)
        {
        sum = a[i] + sum;
        }
        
        double average;
        average = sum/a.length;
        for (int i = 0; i < a.length; i++)
        {
        if (a[i] > average){
        System.out.println("The number "+ a[i] +" above average");
        }
        }
    }
}

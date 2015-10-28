import java.util.Scanner;
public class ArrayEg
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] n = new int [5];
        System.out.println(n);
        System.out.println(n.length);

        for (int i = 0;i < n.length; i++)
        {
            System.out.println("Please enter a integer value:");
            n[i] = sc.nextInt();
        }

        int max = n[0];
        for (int i = 1; i < n.length; i++)
        {
         if (n[i] > max)
         {
            max = n[i];
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}

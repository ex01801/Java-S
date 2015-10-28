import java.util.Scanner;
public class QQ2
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
      
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0){
                System.out.println("The number "+ a[i] +" is even");
            }
        }

    }
}

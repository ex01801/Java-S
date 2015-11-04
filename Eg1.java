import java.util.Scanner;
public class Eg1
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] num = new int [5];
        for(int i=0;i<num.length;i++){
            System.out.println("Please enter a number:");
            num[i] = sc.nextInt();
        }

        int m = num[0];
        for(int i=1;i<num.length;i++){
            m = max(m,num[i]);
        }
        System.out.println(m);
    }

    public static int max(int n1,int n2)
    {
        int max = n1;
        if ( n2 > max){
            max = n2;
        }
        return max;

    }
}

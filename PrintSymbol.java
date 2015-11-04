import java.util.*;
public class PrintSymbol
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a symbol");
        char symbol = sc.nextLine().charAt(0);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        printSymbol(n,symbol);

    }

    public static void printSymbol(int n,char symbol)
    {
        int s = n;
        for(int g=0;g<n;g++){
            int u = 2*(n-s);
            for(int i=0;i<s;i++){
                System.out.print(symbol);
            }
            for(int q=0;q<u;q++){
                System.out.print(" ");
            }
            for(int i=0;i<s;i++){
                System.out.print(symbol);
            }
            s = s-1;
            System.out.println();

        }
    }
}

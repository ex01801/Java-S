import java.util.*;
public class Ps2
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();sc.nextLine();
        System.out.println("Please enter a symbol");
        char symbol = sc.nextLine().charAt(0);
        printSymbol(n,symbol);

    }

    public static void printSymbol(int n,char symbol)
    {
    for(int i=0;i<n;i++){
       for(int e=0;e<n;e++){
       System.out.print(symbol);
        }
        System.out.println(" ");
    }
    }
}

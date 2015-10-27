import java.util.Scanner;
public class MsOrMr
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("what's your gender?(m or f)");
        char gender = sc.nextLine().charAt(0);

        if (gender == 'm') {
            System.out.println("hello Mr. "+ name);
        } else if (gender == 'f'){
            System.out.println("hello Ms. "+ name);
        }

       
       
       
    }
}

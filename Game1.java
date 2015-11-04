import java.util.*;
public class Game1
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int computernum  = (int) (Math.random() * 6);
        for(int i=0;i<3;i++){ 
            System.out.println("Please enter a number between 0 to 6(you have 3 chance)");
            int num = sc.nextInt();
            if (num == computernum){
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Inorrect");
            }
        }
    }
}

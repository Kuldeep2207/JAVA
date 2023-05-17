import java.util.*;
import java.util.Random;
public class Game1{
    public static void main(String arg[]){
        //Game
        //0 for Rock
        //1 for Paper
        //2 for Scissor

        // User gives input for game
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();

        //Computer gives input for game
        Random random = new Random();
        int computerinput = random.nextInt(3);
        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput==0&&computerinput==2 || userinput==1&&computerinput==0 || userinput==2&&computerinput==1)
        {
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win");
         }
        System.out.println("Computer choice-->"+ computerinput);
        }
}

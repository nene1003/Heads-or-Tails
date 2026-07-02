import java.util.Random;
import java.util.Scanner;

public class HeadsorTails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = sc.nextLine();
        System.out.println("Hellow, " + name + "!");

        Random rand = new Random();

        int heads = 0;
        int tails = 0;
        System.out.println("Tossing a coin...");

        for(int i = 1; i <= 3; i++){
            if(rand.nextBoolean()){
                System.out.println("Round " + i + ": Heads");
                heads++;
            }
            else{
                System.out.println("Round " + i + ": Tails");
                tails++;
            }
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);


        if(heads>tails){
            System.out.println(name + " won!");
        }
        else{
            System.out.println(name + " lost!");
        }

        sc.close();
    }
}
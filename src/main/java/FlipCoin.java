import java.util.Random;
import java.lang.*;
public class FlipCoin {

    public static void main(String[] args) {
        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
      if (chance>0.5) {
          System.out.println("Heads");
      }
        if (chance<0.5) {
            System.out.println("Tails");
        }
      }


    }



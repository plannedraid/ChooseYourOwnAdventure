/*
 * Dylan Moore
 * 07/10/2019
 * Choose your own adventure game
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author dymoo6791
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("You are chasing something in the woods but it has a big lead on you, (1) do you take the risky route to try and catch up or (2) the safe route");
        int input1 = in.nextInt();
        if (input1 == 1) {
            System.out.println("You fall and injure your leg and get stuck in the woods");
            System.out.println("Would you like to restart? Yes(1)/ No(2)");
            int input2 = in.nextInt();
            if (input2 == 1) {
                System.out.println("Press F6");
            } else {
                System.exit(0);
            }
        } else if (input1 == 2) {
            System.out.println("you play it safe and go the long way following its tracks");
            System.out.println("While trying to catch up you see a shadow in the distance, do you (1) follow the tracks? or (2) follow the shadow? ");
            int input3 = in.nextInt();
            if (input3 == 1) {
                System.out.println("You follow the foot prints to a group of deer that you startle and  trample you.");
            int input2 = in.nextInt();
            if (input2 == 1) {
                System.out.println("Press F6");
            } else {
                System.exit(0);
            }
            }else{
                System.out.println("when you catch up you spot the thing you're chasing");
            }
        } else {
            System.out.println("invalid");
        }
    }

}

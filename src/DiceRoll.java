import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 6/29/2017.
 */
public class DiceRoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont = "y";

        System.out.println("Enter number of sides for a pair of dice: ");
        int sidesDice = scan.nextInt();
        scan.nextLine();//cleans out scanner

        while (cont.equalsIgnoreCase("y")) {//loop to continue rolling dice

            pressAnyKeyToContinue();//allows user to enter any key to roll

            int i = sidesDice;
            int randomNum1 = (int) (Math.random() * i);//since rardomNum is 0.0-1.0, i multiplied it by
            int randomNum2 = (int) (Math.random() * i);//'i' which equals the amount of sides on dice

            System.out.println("You rolled: ");
            System.out.println(randomNum1);
            System.out.println(randomNum2);

            System.out.println("Roll again? y/n");
            cont = scan.nextLine();
            if (!cont.equalsIgnoreCase("y")) {
                System.out.println("Are you sure? Press 'q' to quit.");
                cont = scan.nextLine();
            }
        }
        System.out.println("Bye, thanks for playing!");
    }




    public static void pressAnyKeyToContinue() {
        System.out.println("Press any key to roll dice: ");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}








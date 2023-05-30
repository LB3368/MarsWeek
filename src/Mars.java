// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mars {
    public static void main(String[] args) {
        //Create a variable named colonyName that is a string, set it equal to desired name
        String colonyName = "New Hope";

        // Create an integer variable name shipPopulation and set it equal to 300
        int shipPopulation = 300;

        //Create a double variable named meals, and set it equal to 4000.00
        double meals = 4000.00;

        //Create a boolean variable named landing, and set it equal to true

        boolean landing = true;

        //Calculate meals left after landing
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        // Call the landingCheck method
        try {
            landingCheck(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}


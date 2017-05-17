import java.util.Scanner;

public class Exercise20_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int index = (int)(Math.random() * stateCapitals.length);
            System.out.print("What's the capital of " + stateCapitals[index][0] + " ? ");
            String temp = input.nextLine();
            if ((temp.toUpperCase()).equals(stateCapitals[index][1].toUpperCase()))
                System.out.println("Right!");
            else
                System.out.println("Wrong!");
            System.out.println("Continue ? y/n");
            String key = input.nextLine();
            if (key.charAt(0) == 'n')
                System.exit(0);
        }
    }

    private static String[][] stateCapitals = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Maryland", "Annapolis"},
        {"Minnesota", "Saint Paul"},
        {"Iowa", "Des Moines"},
        {"Maine", "Augusta"},
        {"Kentucky", "Frankfort"},
        {"Indiana", "Indianapolis"},
        {"Kansas", "Topeka"},
        {"Louisiana", "Baton Rouge"},
        {"Oregon", "Salem"},
        {"Oklahoma", "Oklahoma City"},
        {"Ohio", "Columbus"},
        {"North Dakota", "Bismark"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"New Jersey", "Trenton"},
        {"New Hampshire", "Concord"},
        {"Nevada", "Carson City"},
        {"Nebraska", "Lincoln"},
        {"Montana", "Helena"},
        {"North Carolina", "Raleigh"},
        {"Missouri", "Jefferson City"},
        {"Mississippi", "Jackson"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},
        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
    };
}
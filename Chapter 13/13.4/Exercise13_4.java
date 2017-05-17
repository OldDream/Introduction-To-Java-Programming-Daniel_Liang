import java.util.*;

public class Exercise13_4 {
    public static void main(String[] args) {
        Calendar tempCalendar = new GregorianCalendar();   //0表示一月。
        int year = tempCalendar.get(Calendar.YEAR);
        int month = tempCalendar.get(Calendar.MONTH);
        if (args.length == 2) {
            year = Integer.parseInt(args[1]);
            month = Integer.parseInt(args[0]);
        }
        else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
        }
        else {
            month++;
        }

        Calendar calendar = new GregorianCalendar(year, month - 1, 1);   //0表示一月。

        // Display calander header
        printHeader(calendar);

        // Pad space before the first day of the month
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) 
            System.out.print("    ");

        while (calendar.get(Calendar.DATE) <=
            calendar.getActualMaximum(Calendar.DATE)) {

            if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.printf("%4d\n", calendar.get(Calendar.DATE));
            else
                System.out.printf("%4d", calendar.get(Calendar.DATE));

            //防止月底继续加一天，会回到月初。
            if (calendar.get(Calendar.DATE) == calendar.getActualMaximum(Calendar.DATE)) {
                System.out.println();
                break;
            }
            // Add a day 
            calendar.add(Calendar.DATE, 1);
        }
    }

    public static void printHeader(Calendar calendar) {
        // Create an array of month names
        String[] months = getMonths();

        // Center month and year center format
        int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
        System.out.println();
        for (int i = 0; i < length; i++)
            System.out.print(" ");    //这是为了让文字居中。。
        System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + 
            calendar.get(Calendar.YEAR));

        // Print week day names
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String[] getMonths() {
        String[] months = {"January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"};
        return months;
    }
}
import java.util.Scanner;

public class dayinmonth {
    public static void main(String[] args) {

        //System.out.println('a');
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Which month that you want to count day?");

        int month = 5;
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "")

            System.out.printf("The day '%d' has $s days !", month, daysInMonth);
        else
            System.out.println("Invalid input");
    }
}

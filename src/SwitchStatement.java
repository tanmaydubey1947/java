public class SwitchStatement {
    public static void main(String[] args) {

        int day = 3;
        String dayType;

        switch (day) {
            case 1:
                dayType = "Monday";
                break;
            case 2:
                dayType = "Tuesday";
                break;
            case 3:
                dayType = "Wednesday";
                break;
            case 4:
                dayType = "Thursday";
                break;
            case 5:
                dayType = "Friday";
                break;
            case 6:
                dayType = "Saturday";
                break;
            case 7:
                dayType = "Sunday";
                break;
            default:
                dayType = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is a " + dayType);

        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
        };
    }
}
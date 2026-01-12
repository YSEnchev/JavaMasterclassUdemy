public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int second) {

        if (second < 0) {
            return "Invalid data for second(" + second + "), must be a positive integer value";
        }

        int minutes = second / 60;
        return getDurationString(second / 60, second % 60);
    }

    public static String getDurationString(int minutes, int second) {

        if (minutes < 0) {
            return "Invalid data for second(" + minutes + "), must be a positive integer value";
        }

        if (second < 0 || second > 59) {
            return "Invalid data for second(" + second + "), must be a between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;


        return hours + "h " + remainingMinutes + "m " + second + "s";
    }
}

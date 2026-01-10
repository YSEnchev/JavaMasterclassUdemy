public class OverloadedMethodChallange {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(100, 5));
    }
//
//    public static double convertToCentimeters(int inches) {
//
//        return inches * 2.54;
//    }
//
//    public static double convertToCentimeters(int foot, int inches) {
//
//        double convertFootToInch = foot * 12;
//        double totalInches = convertFootToInch + inches;
//    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        // return convertToCentimeters((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}

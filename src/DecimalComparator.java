public class DecimalComparator {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        long firstNum = (long) (firstNumber * 1000);
        long secondNum = (long) (secondNumber * 1000);

        return firstNum == secondNum;
    }

}
public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int firstAgeParameter, int secondAgeParameter, int thirdAfeParameter) {

        return isTeen(firstAgeParameter) || isTeen(secondAgeParameter) || isTeen(thirdAfeParameter);
    }

    public static boolean isTeen(int age) {
        return age > 12 && age < 20;
    }

}

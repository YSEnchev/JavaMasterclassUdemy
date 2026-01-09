public class PositiveNegativeOrZero {
    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

    }
////№1 РЕШЕНИЕ
//    public static void checkNumber(int number) {
//        String valueNumber = "";
//        if (number > 0) {
//            valueNumber = "positive";
//            System.out.println(valueNumber);
//        } else if (number < 0) {
//            valueNumber = "negative";
//            System.out.println(valueNumber);
//        } else {
//            valueNumber = "zero";
//            System.out.println(valueNumber);
//        }
//
//    }

    //№2 РЕШЕНИЕ
    public static void checkNumber(int number) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }

    //№3 РЕШЕНИЕ
    //System.out.println((number >0) ? "positive" : ((number< 0) ? "negative" : "zero"));

}

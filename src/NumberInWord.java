public class NumberInWord {
    public static void main(String[] args) {

        printNumberInWord(3);
    }

    public static void printNumberInWord(int number) {

        String numberInWorld;
        switch (number) {
            case 0 -> numberInWorld = "ZERO";
            case 1 -> numberInWorld = "ONE";
            case 2 -> numberInWorld = "TWO";
            case 3 -> numberInWorld = "THREE";
            case 4 -> numberInWorld = "FOUR";
            case 5 -> numberInWorld = "FIVE";
            case 6 -> numberInWorld = "SIX";
            case 7 -> numberInWorld = "SEVEN";
            case 8 -> numberInWorld = "EIGHT";
            case 9 -> numberInWorld = "NINE";
            default -> numberInWorld = "OTHER";
        }

        System.out.println(numberInWorld);

    }

}


public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sumOfDigits=0;

        if (number < 10) {
            return -1;
        } else {
            while (number!=0) {
                sumOfDigits += number % 10;
                number = number / 10;
            }
            return sumOfDigits;

        }
    }
}

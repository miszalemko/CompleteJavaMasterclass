public class Runner {
    public static void main(String[] args) {
        int evenNumbersCounter = 0;
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            evenNumbersCounter++;
            System.out.println("Even number " + number);
            if (evenNumbersCounter == 5) {
                break;
            }
            number++;
        }
        System.out.println("Total even numbers is  " + evenNumbersCounter);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

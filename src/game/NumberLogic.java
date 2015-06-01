package game;

public class NumberLogic {

    public boolean isPrime(int number) {
        boolean isPrimeNumber;
        if (isSimplePrime(number)) {
            System.out.println(number + " - is Prime. Nice attack!\n");
            isPrimeNumber = true;
        } else if (isPositive(number) && isNotStandardMultiple(number)) {
            System.out.println(number + " - is Prime. Nice attack!\n");
            isPrimeNumber = true;
        } else {
            System.out.println(number + " - is NOT Prime. Devil counterattacked you!\n");
            isPrimeNumber = false;
        }
        return isPrimeNumber;
    }

    private boolean isPositive(int number) {
        return number > 1;
    }

    private boolean isSimplePrime(int number) {
        boolean isSimple = false;
        switch (number) {
            case 2:
                isSimple = true;
            break;
            case 3:
                isSimple = true;
            break;
            case 5:
                isSimple = true;
            break;
            case 7:
                isSimple = true;
            break;
            default:
                break;
        }
        return isSimple;
    }

    private boolean isNotStandardMultiple(int number) {
        return !isMultipleTwo(number)
            && !isMultipleThree(number)
            && !isMultipleFive(number)
            && !isMultipleSeven(number);
    }

    private boolean isMultipleTwo(int number) {
        return number % 2 == 0;
    }

    private boolean isMultipleThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleSeven(int number) {
        return number % 7 == 0;
    }
}

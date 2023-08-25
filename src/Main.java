public class Main {
    public static int countOnesInBinary(int decimalNumber) {
        int count = 0;

        while (decimalNumber > 0) {
            if (decimalNumber % 2 == 1) {
                count++;
            }
            decimalNumber /= 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int decimalValue = 11;
        int onesCount = countOnesInBinary(decimalValue);
        System.out.println("Number of ones in binary notation: " + onesCount);
    }
}







import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Methods to determine if a number is prime.
 */
public class PrimeDirective {

    private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    /**
     * Determines if a number is prime.
     * @param number input
     * @return boolean
     */
    public boolean isPrime(int number) {
        boolean isPrime = true;
        // number/2 because we'll never have to divide anything
        // by more than half of itself
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    /**
     * Stores the prime number in an ArrayList
     * @param s int[]
     * @return ArrayList
     */
    public void onlyPrimes(ArrayList<Integer> s) {
        //TODO:
        //  - Make another method for non-primes

        for(int i = 0; i < s.size(); i++) {
            if(this.isPrime(s.get(i))) {
                primeNumbers.add(s.get(i));
            } else {
                numbers.add(s.get(i));
            }
        }

    }


    public void sort() { //TODO make methods to sort each list.
        Collections.sort(primeNumbers);
        Collections.sort(numbers);
    }

    @Override
    public String toString() {
        String toString = "Prime Numbers: ";
        for (int i = 0; i < primeNumbers.size(); i++) {
            if(!(i == primeNumbers.size() - 1)) {
                toString += primeNumbers.get(i);
                toString += ", ";
            } else {
                toString += primeNumbers.get(i);
            }
        }
        toString += "\n" +
                "Not Prime: ";
        for (int i = 0; i < numbers.size(); i++) {
            if(!(i == numbers.size() - 1)) {
                toString += numbers.get(i);
                toString += ", ";
            } else {
                toString += numbers.get(i);
            }
        }
        return toString;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();

        //uncomment below for pop-up
//        String input = JOptionPane.showInputDialog("Enter a list of numbers separated by commas: ");
//        Scanner scan = new Scanner(input);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by commas: ");
        String input = scan.nextLine();
        Scanner inputScanner = new Scanner(input);
        inputScanner.useDelimiter(",");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (inputScanner.hasNext()) {
            int j = Integer.parseInt(inputScanner.next().trim());
            numbers.add(j);
        }
//        int[] numbers = {6, 29, 28, 33, 11, 100, 143, 121, 101, 43, 89};
        pd.onlyPrimes(numbers);

        System.out.println(pd.toString());
        pd.sort();
        System.out.println("\n------ Sorted ------ ");
        System.out.println(pd.toString());


    }
}


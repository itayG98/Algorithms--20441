public class SelectedPrimesCalc {

    public static int SelectedPrimes(int num, int x) {
        if (num<0)
            return -1;
        return SelectedPrimes(num, x, 2, 0);
    }

    private static int SelectedPrimes(int num, int x, int currPrime, int currPrimeCount) {
        if (num % currPrime != 0) {
            if (x == currPrimeCount) {
                System.out.println(currPrime);
                return 1 + SelectedPrimes(num, x, nextPrime(currPrime), 0);
            } else {
                return SelectedPrimes(num, x, nextPrime(currPrime), 0);
            }
        }
        if (num == currPrime) {
            if (x == currPrimeCount+1) {
                System.out.println(currPrime);
                return 1;
            } else {
                return 0;
            }
        }
        return SelectedPrimes(num / currPrime, x, currPrime, currPrimeCount + 1);
    }

    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
                i = 2;
            } else {
                continue;
            }
        }
        return num;
    }
}

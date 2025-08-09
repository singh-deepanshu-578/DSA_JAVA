public class Primes_In_Range {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if (n==2){
            return isPrime;
        }
        for(int i=2; i<=Math.sqrt(n); i++){ //completely dividing
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void primes_in_range(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        /* System.out.println(isPrime(3));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));
        System.out.println(isPrime(2));
        */
        primes_in_range(10);
        primes_in_range(20);
        primes_in_range(100);
        primes_in_range(200);
    }
}

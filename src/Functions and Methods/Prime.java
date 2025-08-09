public class Prime {

    public static boolean isPrime(int n){
        boolean isPrime=true;
        if (n==2){
            return isPrime;
        }
        for(int i=2;i<=n-1;i++){ //completely dividing
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(3));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));
        System.out.println(isPrime(2));
    }
}

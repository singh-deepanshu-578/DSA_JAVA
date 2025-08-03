public class Factorial {
    public static int factorial(int n) {
        int fact=1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int fact=factorial(3);
        System.out.println(fact);
        fact=factorial(5);
        System.out.println(fact);
    }
}

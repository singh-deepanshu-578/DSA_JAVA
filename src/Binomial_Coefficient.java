/*Binomial Coefficient = n!/(r!(n-r)!)
 */

import java.util.*;
public class Binomial_Coefficient {
    public static int factorial(int n) {
        int fact=1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();

        int bc=factorial(n)/(factorial(r)*(factorial(n-r)));
        System.out.println("Binomial Coefficient = "+ bc);
        sc.close();
    }
}

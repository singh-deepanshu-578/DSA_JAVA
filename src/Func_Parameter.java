import java.util.*;
public class Func_Parameter {

    public static void calculateSum(int num1, int num2){ /*num1 and num2 are parameters or formal parameters 
                                                          (at the time of func definition)*/
        int sum=num1+num2;
        System.out.println("Sum is: "+sum);
    }

    public static int calcSum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a:");
        int a=sc.nextInt();
        System.out.print("Enter num b:");
        int b=sc.nextInt();
        calculateSum(a,b);
        int sum1=calcSum(a, b); //a and b are arguments or actual parameters (at the time of func call)
        System.out.println("Sum is:" + sum1);
        sc.close();
    }
}

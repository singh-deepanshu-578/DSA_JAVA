/*java always call by value
*/

public class Call_by_Value {

    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("Before Swapping:");        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After Swapping:");
        swap(a, b);
    }
}

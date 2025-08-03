import java.util.*;

public class Largest_in_Array {

  public static int getLargest(int arr[]){
    int largest = Integer.MIN_VALUE; //-infinity
    for(int i=0; i<arr.length; i++){
      if(largest<arr[i]){
        largest=arr[i];
      }
    }
    return largest;
  }
  public static void main(String[] args) {
    int arr[];
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n=sc.nextInt();

    arr = new int[n];

    for (int i=0; i<n; i++){
      System.out.println("Enter " + (i+1) + "th number :");
      arr[i]=sc.nextInt();
    }

    System.out.println("Your entered array is:");
    for (int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("The largest number in the array is: " + getLargest(arr));
  }
}

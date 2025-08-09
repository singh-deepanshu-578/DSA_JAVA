import java.util.Scanner;

public class Linear_Search {

  public static int LinearSearch(int numbers[], int n, int key){
    for(int i=0; i<n; i++){
      if(numbers[i]==key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int numbers[];
    int n, key;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n=sc.nextInt();

    numbers = new int[n];

    for (int i=0; i<n; i++){
      System.out.println("Enter " + (i+1) + "th number :");
      numbers[i]=sc.nextInt();
    }

    System.out.println("Your entered array is:");
    for (int i=0; i<n; i++){
      System.out.print(numbers[i] + " ");
    }

    System.out.println();
    System.out.println("Enter key to be searched :");
    key=sc.nextInt();

    int index = LinearSearch(numbers, n, key);
    if(index == -1){
      System.out.println("Key not found");
    }else{
      System.out.println("Key is found at index " + index);
    }
  }
}

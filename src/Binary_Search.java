public class Binary_Search {

  public static int search(int arr[], int key){
    int start=0, end=arr.length-1;
    
    while(start<=end){
      int mid = (start+end)/2;
      
      if(arr[mid]==key){ //key at mid
        return mid;
      }else if(arr[mid]<key){ //key in right half
        start=mid+1;
      }else{ //key in Left half
        end=mid-1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10,12,14};
    int key=10;
    System.out.println("Array is: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println(key + " is found at index: " + search(arr, key));
  }
}

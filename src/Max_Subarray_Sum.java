//brute force

public class Max_Subarray_Sum {

  public static void printMaxSubarraySum_bf(int arr[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
      for(int j=i; j<arr.length; j++){
        currSum=0;
        for(int k=i; k<=j; k++){
          currSum+=arr[k];
        }
        if(maxSum<currSum){
          maxSum=currSum;
        }
      }
    }
    System.out.println("Max Sum = " + maxSum);
  }

  //prefix sum method
  public static void printMaxSubarray_prefix(int arr[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }

    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
        if(maxSum<currSum){
          maxSum=currSum;
        }
      }
    }
    System.out.println("Max Sum = " + maxSum);
  }

  //kadane's algorithm

  public static void kadane(int arr[]){
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;

    for(int i=0; i<arr.length; i++){
      currSum = Math.max(arr[i], currSum+ arr[i]);
      maxSum = Math.max(maxSum, currSum);
    }

    System.out.println("Max sum: " + maxSum);
  }
  public static void main(String[] args) {
    int arr[] = {-1,-2,-3,-4};
    printMaxSubarraySum_bf(arr);
    printMaxSubarray_prefix(arr);
    kadane(arr);
  }
}

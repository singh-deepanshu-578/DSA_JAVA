public class Dec_to_Bin {
  public static void dec_to_bin(int dec){
    int Orig_dec = dec;
    int pow=0;
    int binNum=0;
    while(dec>0){
      int rem = dec % 2;
      binNum = binNum + (rem * (int)Math.pow(10,pow));
      pow++;
      dec = dec/2;
    }
    System.out.println("Binary of "+ Orig_dec + " is " + binNum);
  }

  public static void main(String[] args) {
    dec_to_bin(7);
    dec_to_bin(2);
    dec_to_bin(8);
  }
}

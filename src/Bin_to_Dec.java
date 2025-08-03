public class Bin_to_Dec {

  public static void binTodec(int binNum){
    int orig_BinNum = binNum;
    int pow=0;
    int decNum=0;
    
    while(binNum>0){
      int LastDigit = binNum%10;
      decNum = decNum + (LastDigit * (int)Math.pow(2,pow));
      
      pow++;
      binNum=binNum/10;
    }
    System.out.println("Decimal of "+ orig_BinNum + " is " + decNum);
  }

  public static void main(String[] args) {
    binTodec(11100);
  }
}

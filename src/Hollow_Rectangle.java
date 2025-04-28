/*
print:- 
*****
*   *
*   *
*****
*/
public class Hollow_Rectangle {
  public static void hollow_rect (int totalRows, int totalCols){
    //outer loop for rows
    for (int i=1; i<=totalRows; i++){
      //inner loop for cols
      for (int j=1; j<=totalCols; j++){
        //cell - (i,j)
        if (i==1 || i==totalRows || j==1 || j==totalCols){
          //boundary cells
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    hollow_rect(4,5);
  }
}

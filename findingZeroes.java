public class findingZeroes{

  public static void main(String[] args){
    int i = 0;
    boolean zeroFound = false;

    while (!zeroFound){
      if(f(i)!=0) i = i + 1;
      else{
        System.out.println("With input " + i + ", f() = 0");
        zeroFound = true;
      }
    }
  }

  public static int f(int n){
    return n+1;
  }

}

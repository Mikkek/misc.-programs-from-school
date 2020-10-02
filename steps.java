public class steps{

  public static void main(String[] args){
    System.out.println("total number of iterations: " + downToOne(5));
  }

/*
**if n is even divide by 2
**else times 3 + 1
**returns the total number of iterations required for result 1
**
*/
  public static int downToOne(int n){
    int i = 0;

    while(n != 1){
      if((n % 2) == 0){
        n = n/2;
      }
      else{
        n = (n * 3) + 1;
      }
      System.out.println(n);
      i = i + 1;
    }
    return i;
  }
}

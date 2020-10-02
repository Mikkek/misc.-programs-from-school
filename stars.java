public class stars{

  public static void main(String[] args){
    triangle(1000);
  }

/*
**prints n symbols
**
*/
  public static void symbols(int n, char c){
    int i = 0;
    while(i < n){
      System.out.print(c);
      i = i + 1;
    }
  }

  /*
  **prints n lines of stars
  **
  */
  public static void lineOfStars(int n){
    int i = 0;
    while(i < n){
      i = i + 1;
      symbols(i, '*');
      System.out.println();
    }
  }

  /*
  **prints a tree of stars
  **
  */
  public static void triangle(int n){
    int i = 0;
    int tri = 1;
    while(i < n){
      symbols(n - (i + 1), ' ');
      symbols(tri, '*');
      System.out.println();
      i = i + 1;
      tri = tri + 2;
    }
  }
}

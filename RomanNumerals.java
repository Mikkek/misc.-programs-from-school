import java.util.Scanner;

public class RomanNumerals{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean userExit = false;
    System.out.println("\nUsable methods: \n\tromanToNum (Converts roman numerals in to integer) \n\tnumToRoman (Converts integer numerals in to roman) \n\tadd (Adds two roman numerals together) \n\texit (End)\n");

    do{
      switch(input.next()){
        case "romanToNum":
          System.out.println("Please enter a roman numeral (NOTE: must be all caps)\n");
          System.out.println(romanToNum(input.next()));
          break;

        case "numToRoman":
          System.out.println("Please enter an integer\n");
          System.out.println(numToRoman(input.nextInt()));
          break;

        case "add":
          System.out.println("Please enter two roman numerals");
          System.out.println(add(input.next(), input.next()));
          break;

        case "exit":
          userExit = true;
          break;


        default:
          System.out.println("Unkown method");
      }
    }while(!userExit);

  }

  public static int romanToNum(String roman){
    int total = 0;
    for(char c:roman.toCharArray()){
      switch (c){
        case 'I':
          total += 1;
          break;

        case 'V':
          total += 5;
          break;

        case 'X':
          total += 10;
          break;

        case 'L':
          total += 50;
          break;

        case 'C':
          total += 100;
          break;

        case 'D':
          total += 500;
          break;

        case 'M':
          total += 1000;
          break;

        default:
          System.out.println("UNKNOWN SYMBOL IN NUMBER!!!");
          return 0;
      }
    }
    return total;

  }

  public static String numToRoman(int n){
    String res = "";

    while(n > 0){
      if(n >= 1000){
        n -= 1000;
        res += "M";
      }
      else if(n >= 500){
        n -= 500;
        res += "D";
      }
      else if(n >= 100){
        n -= 100;
        res += "C";
      }
      else if(n >= 50){
        n -= 50;
        res += "L";
      }
      else if(n >= 10){
        n -= 10;
        res += "X";
      }
      else if(n >= 5){
        n -= 5;
        res += "V";
      }
      else{
        n -= 1;
        res += "I";
      }
    }
    return res;
  }

  public static String add(String rom1, String rom2){
    return numToRoman(romanToNum(rom1) + romanToNum(rom2));
  }


}

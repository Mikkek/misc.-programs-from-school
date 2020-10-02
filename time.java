public class time{
  public static void main(String[] args){
    int hours = 1;
    int minutes = 15;
    int seconds = 30;

    int timeInSec = hours * 3600 + minutes * 60 + seconds; //time in seconds is calculated and assigned when declaring the variable

    System.out.println("time in seconds is " + timeInSec);
  }
}

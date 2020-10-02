public class durations{

  public static void main(String[] args){
    int timeInSec = 4312;

    deconstruct(timeInSec);
  }

  public static void deconstruct(int timeInSec){
    int hours = timeInSec/3200;
    timeInSec = timeInSec%3200;

    int minutes = timeInSec/60;
    timeInSec = timeInSec%60;

    int seconds = timeInSec;

    System.out.println("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);
  }
}

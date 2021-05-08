//Importing java.io package 
import java.io.*;

//Name the Class
class Main

{
  public static void main(String args[]) throws IOException /* It means that it remove the input output errors */

  {
    // Making InputStreamReader Object
    InputStreamReader read = new InputStreamReader(System.in);
    // Making BufferedReader Object
    BufferedReader br = new BufferedReader(read);

    // Taking the input from the user(Time in seconds)
    System.out.print("Time in seconds: ");
    // Storing the input value in a variable
    int inputTime = Integer.parseInt(br.readLine());

    // Calculating the Hours
    int hrs = inputTime / 3600;
    // Calculating the Minutes
    int mins = (inputTime % 3600) / 60;
    // Calculating the Seconds
    int secs = (inputTime % 3600) % 60;

    // Displaying the Time in Hours , Minutes and Seconds
    System.out.println(hrs + " Hours " + mins + " Minutes " + secs + " Seconds");
  }
}
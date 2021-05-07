//
import java.io.*;

class Main 
{
  public static void main(String args[]) throws IOException

  {
    InputStreamReader read = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(read);

    System.out.print("Time in seconds: ");
    int inputTime = Integer.parseInt(br.readLine());

    int hrs = inputTime / 3600;
    int mins = (inputTime % 3600) / 60;
    int secs = (inputTime % 3600) % 60;

    System.out.println(hrs + " Hours " + mins + " Minutes " + secs + " Seconds");
  }
}
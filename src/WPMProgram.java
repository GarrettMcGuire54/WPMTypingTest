import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static java.lang.System.out;
import static java.time.LocalTime.now;

import java.util.Scanner;

public class WPMProgram {

    static String[] words = {"the", "hello", "french", "potato", "array", "system", "double", "java", "print", "repo"};
    public static void main(String[] args) throws InterruptedException {

        out.println("3");
        TimeUnit.SECONDS.sleep(1);
        out.println("2");
        TimeUnit.SECONDS.sleep(1);
        out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i = 0; i<10; i++){
            out.print(words[rand.nextInt(9)] + " ");
        }
        out.println();
        double start =  LocalTime.now().toNanoOfDay();

        Scanner keyboard = new Scanner(System.in);
        String typedWords = keyboard.nextLine();

        double end =  LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedWords.length();
        // (x characters / 5) / 1 min = y WPM
        int wpm = (int) ((((double)numChars / 5) / seconds) * 60);

        out.println("Your words per minute is " + wpm + "!");

        out.println(elapsedTime);


    }
}

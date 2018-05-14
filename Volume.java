import sounds.*;
import java.util.Scanner;
/**
 * This program asks the user to input a volume multiplication factor, and then
 * reads in an audio file and uses a 'for-each' loop to inspect every sample in
 * the sound file and multiply the value by the input factor.  The program then
 * displays a graphic image of the sound file, and plays it audibly.
 * 
 * @author Mr. B!
 * @version September 19, 2013
 */

public class Volume
{
    public static void main(String[]args)
    {
        // open up a keyboard scanner
        Scanner reader = new Scanner(System.in);
        // ask the user for a volume factor
        System.out.print("Enter a volume factor (multiplier) as a decimal number: ");
        // wait until the user enters a decimal number
        double factor = reader.nextDouble();
        // read in the audio file
        APSoundClip clip = new APSoundClip("money.wav");
        // display the clip player
        clip.draw();
        // play the clip
        clip.play();

        // this is a 'for-each' loop - in other words to examine each 'Sample p' (one at a time) that is in 'clip'
        // to be read as "for each Sample s in clip"
        // each sample in 'clip' is automatically assigned one-at-a-time to 's' in the loop below
        for (Sample s : clip)
        {
            // establish a new value equal to the old value times the multiplyer
            int newValue = (int)(s.getValue() * factor);
            // set the sample to the new value
            s.setValue(newValue);
        }      
    }
}

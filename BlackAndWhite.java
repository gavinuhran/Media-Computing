import images.APImage;
import images.Pixel;
import java.util.Scanner;
/**
 * This program reads a grahic image (picture) from a file, and then examines
 * each pixel using a 'for-each' loop.  If the average pixel value is less than
 * 128, the pixel value is set to zero, otherwise the pixel value is set to 255.
 * This will convert a color image to a black and white image.  The user must press
 * then press the Enter key to display the newly modified image
 * 
 * @author Mr. B!
 * @version September 18, 2013
 */
public class BlackAndWhite
{
    public static void main (String [] args)
    {
        // open up a keyboard scanner
        Scanner reader = new Scanner(System.in);
        // read in the file image
        APImage image = new APImage("smokey.jpg");
        // display the original image
        image.draw();
        
        // this is a 'for-each' loop - in other words to examine each 'Pixel p' (one at a time) that is in 'image'
        // to be read as "for each Pixel p in image"
        // each pixel in 'image' is automatically assigned one-at-a-time to 'p' in the loop below
        for(Pixel p : image)
        {
            // each time this loop executes, it is working with a different pixel 'p'
            int red = p.getRed();       // get the red value (0 -255)
            int green = p.getGreen();   // get the green value (0 -255)
            int blue = p.getBlue();     // get the blue value (0 - 255)
            int average = (red + green + blue) / 3; // determine the average of all three values

            // if the average value is dark
            if (average < 128)
            {
                // make the pixel black (all color values set to zero)
                p.setRed(0);
                p.setGreen(0);
                p.setBlue(0);
            }
            // otherwise the average value is light
            else
            {
                // make the pixel white (all color values set to 255)
                p.setRed(255);
                p.setGreen(255);
                p.setBlue(255);
            }
        }
        // we need to pause the process so there is time to see the original image before the modified one is redrawn in it's place
        System.out.println("Press Enter to continue");
        reader.nextLine();  // used to pause the process until the user presses the Enter key
        image.draw();   // redraw the modified image
    }
}

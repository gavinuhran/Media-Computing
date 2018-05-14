//Grayscale Image
//Author: Gavin Uhran
//Version: 9/21/17

import java.util.Scanner;
import images.Pixel;
import images.APImage;

public class Grayscale
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Press 1 for Smokey, 2 for Spring, or 3 for Mr. B!");
        int path = reader.nextInt();
        APImage image;
        if (path == 1)
        {
            image = new APImage("smokey.jpg");
        }
        else if (path == 2)
        {
            image = new APImage("Spring.jpg");
        }
        else if (path == 3) 
        {
            image = new APImage("MrB.JPG");
        }
        else
        {
            image = new APImage("blank.jpg");
        }
        
        image.draw();
        
        for (Pixel p : image)
        {
            int red = p.getRed();
            int blue = p.getBlue();
            int green = p.getGreen();
            int average = (red + blue + green) / 3;
            
            p.setRed(average);
            p.setBlue(average);
            p.setGreen(average);
        }
        
        System.out.println("Press Enter to continue");
        reader.nextLine();
        image.draw();
    }
}

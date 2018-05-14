//Posterized Image
//Author: Gavin Uhran
//Version: 9/24/17

import java.util.Random;
import java.util.Scanner;
import images.Pixel;
import images.APImage;
import java.io.*;

public class PosterizedImageV1
{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Press 1 for Smokey, 2 for Spring, or 3 for Mr. B!");
        int path = reader.nextInt();
        APImage image;
        
        Random generator = new Random();
        int red0 = generator.nextInt(256);
        int blue0 = generator.nextInt(256);
        int green0 = generator.nextInt(256);
        int red1 = generator.nextInt(256);
        int blue1 = generator.nextInt(256);
        int green1 = generator.nextInt(256);
        
        if (path == 1)
        {
            image = new APImage("Smokey.jpg");
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
        for (Pixel p : image)
        {
            int red = p.getRed();
            int blue = p.getBlue();
            int green = p.getGreen();
            if ((red + green + blue)/3 < 128)
            {
                p.setRed(red0);
                p.setBlue(blue0);
                p.setGreen(green0);
            }
            else
            {
                p.setRed(red1);
                p.setBlue(blue1);
                p.setGreen(green1);
            }
        }
        image.draw();
    }
}

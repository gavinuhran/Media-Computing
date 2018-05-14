//Flipped Image
//Author: Gavin Uhran
//Version: 9/26/17

import images.APImage;
import images.Pixel;

public class FlippedImage
{
    public static void main(String[] args)
    {
        APImage image = new APImage("MrB.jpg");
        image.draw();
        
        int width = image.getWidth();
        int height = image.getHeight();
        APImage flippedImage = new APImage(width, height);
        
        int newY = 0;
        for(int y = height - 1; y >= 0; y--)
        {
            int newX = 0;
            for (int x = width - 1; x >= 0; x--)
            {
                Pixel pixel = image.getPixel(x, y);
                Pixel newPixel = pixel.clone();
                flippedImage.setPixel(newX, newY, newPixel);
                newX++;
            }
            newY++;
        }
        
        flippedImage.draw();
    }
}

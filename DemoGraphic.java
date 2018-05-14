import images.APImage;

public class DemoGraphic
{
   public static void main(String[]args)
   {
      APImage image;

      image = new APImage("spring.jpg");
      image.draw();

      image = new APImage("smokey.jpg");
      image.draw();
            
      image = new APImage("mrB.jpg");
      image.draw();
   }  
}
      
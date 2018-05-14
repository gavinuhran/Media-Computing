import sounds.APSoundClip;  
import sounds.Sample;

public class DemoSound
{
   public static void main(String[]args)
   {
      APSoundClip clip = new APSoundClip("money.wav");
      clip.draw();
      clip.play();
   }
}
      
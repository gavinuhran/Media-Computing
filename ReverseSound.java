//Reverse Sound
//Play a sound file backwards
//Author: Gavin Uhran
//Version: 9/28/17

import sounds.APSoundClip;
import sounds.Sample;

public class ReverseSound
{
    public static void main(String[] args)
    {
        APSoundClip clip = new APSoundClip("BlueBossa.wav");
        int start = 1;
        int end = clip.getLength() - 1;
        
        while (start < end)
        {
            Sample leftSide = clip.getSample(start);
            Sample rightSide = clip.getSample(end);
            clip.setSample(start,rightSide);
            clip.setSample(end,leftSide);
            start++;
            end--;
        }
        
        clip.draw();
        clip.play();
    }
}
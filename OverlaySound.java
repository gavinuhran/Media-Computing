//OverlaySound
//Combine two sound files into one and play it
//Author: Gavin Uhran
//Version: 9/28/17

import sounds.APSoundClip;
import sounds.Sample;

public class OverlaySound
{
    public static void main(String[] args)
    {
        APSoundClip clip1 = new APSoundClip("money.wav");
        APSoundClip clip2 = new APSoundClip("BlueBossa.wav");
        APSoundClip newClip = clip2.clone();
        int pos = 0;
        
        for(Sample sampleClip1 : clip1)
        {
            Sample sampleClip2 = clip2.getSample(pos);
            int newValue = sampleClip1.getValue() + sampleClip2.getValue();
            newClip.getSample(pos).setValue(newValue);
            pos++;
        }
        
        newClip.draw();
        newClip.play();
    }
}

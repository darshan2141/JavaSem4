import java.awt.*;
import java.applet.*;
//<applet code="demo" width="500" height="500"></applet>
public class demo extends Applet{
    AudioClip clip;
    public void init(){
        clip = getAudioClip(getDocumentBase(),"demoMusic.mp3");
    }
    public void paint(Graphics g){
        clip.play();
        //clip.pause();
        clip.stop();
    }
}
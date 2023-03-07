import java.applet.AudioClip;
public class Proceso1 extends Thread{
	
	@Override
	public void run(){
		AudioClip sonido;
		sonido = java.applet.Applet.newAudioClip(getClass().getResource("/audio/300_hu_hu_hu.wav"));
		sonido.play();
	}
	
}
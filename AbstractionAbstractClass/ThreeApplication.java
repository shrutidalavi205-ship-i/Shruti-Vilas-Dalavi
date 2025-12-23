package AbstractionAbstractClass;

public class ThreeApplication {

	public static void main(String[] args) {
		ThreeMediaPlayer m;
		m = new ThreeAudioPlayer();
		System.out.println("Audio player Details");
		m.playMedia();
		m.stopMedia();
		m.pauseMedia();
		System.out.println(" ");
		m = new ThreeVideoPlayer();
		System.out.println("Video player Details");
		m.playMedia();
		m.stopMedia();
		m.pauseMedia();
	}
}

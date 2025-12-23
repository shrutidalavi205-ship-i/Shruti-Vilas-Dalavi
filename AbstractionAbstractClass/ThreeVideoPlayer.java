package AbstractionAbstractClass;

public class ThreeVideoPlayer extends ThreeMediaPlayer {

	@Override
	public void playMedia() {
		System.out.println("Start Video");
	}

	@Override
	public void stopMedia() {
		System.out.println("Stop Video");
	}

}

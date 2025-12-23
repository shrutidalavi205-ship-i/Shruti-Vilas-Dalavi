package AbstractionAbstractClass;

public class ThreeAudioPlayer extends ThreeMediaPlayer {

	@Override
	public void playMedia() {
		System.out.println("Start Audio");
	}

	@Override
	public void stopMedia() {
		System.out.println("End Audio");
	}

}

package AbstractionAbstractClass;

public abstract class ThreeMediaPlayer {

	public abstract void playMedia();

	public void pauseMedia() {
		System.out.println("When Audio and Video end it will be paused");
	}

	public abstract void stopMedia();
}

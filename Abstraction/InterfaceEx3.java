package Abstraction;
interface Playable
{
  void play();
  void pause();
  void stop();
  
}
class MusicPlayer implements Playable
{
	@Override
	public void play() {
	System.out.println("Music is Playing..");
	}
	@Override
	public void pause() {
		System.out.println("Music has been Paused..");
	}
	void ChangeTrack()
	{
		System.out.println("Changing the track..");
	
	}
	@Override
	public void stop() {
		System.out.println("Music is Stopped..");
		System.out.println();
	}
}
class VideoPlayer implements Playable
{
	@Override
	public void play() {
	System.out.println("Video is Playing..");
	}
	@Override
	public void pause() {
		System.out.println("Video has been Paused..");
	}
	void FastForward()
	{
		System.out.println("FastForwarding the video..");
	}
	@Override
	public void stop() {
		System.out.println("Video is Stopped..");
	}
}

public class InterfaceEx3 {
public static void main(String[] args) {
	MusicPlayer m=new MusicPlayer();
	m.play();
	m.pause();
	m.ChangeTrack();
	m.stop();
	
	VideoPlayer v=new VideoPlayer();
	v.play();
	v.pause();
	v.FastForward();
	v.stop();
}

}

package ex01;

public class PlayerController {
	
	public static void main(String[] args) {
		
		/*
		 * play(new MP3Player()); play(new WAVPlayer()); play(new FLACPlayer());
		 */
		
		MediaPlayer mp = new MP3Player();
		
		mp.loadFile(null, 0, 0, false, false);
		
		mp.play();
		mp.pause();
		mp.pause();
		
		
		
	}
	
	public static void play(MediaPlayer mp) {
		mp.play();
	}

}

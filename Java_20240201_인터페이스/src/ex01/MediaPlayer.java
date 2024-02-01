package ex01;

public interface MediaPlayer {
	
	void play();
	
	void pause();
	
	void stop();

	void loadFile(String name, int time, int size, boolean run, boolean pauseButton);
}

package ex01;

public class MP3Player implements MediaPlayer{
	
	private String name;
	private int time;
	private int size;
	private boolean run;
	private boolean pauseButton; //false
	

	@Override
	public void play() {
		run = true;
		System.out.println("재생 중");
	}

	@Override
	public void pause() {
		if (!pauseButton) {
			pauseButton = true;
			System.out.println("일시정지");
		} else {
			pauseButton = false;
			System.out.println("다시 재생");
		}
	}

	@Override
	public void stop() {
		run = false;
		System.out.println("정지");
		
	}

	@Override
	public void loadFile(String name, int time, int size, boolean run, boolean pauseButton) {
		this.name = name;
		this.time = time;
		this.size = size;
		this.run = false;
		this.pauseButton = false;
		System.out.println("파일이 성공적으로 로드되었습니다");
		
	}


}

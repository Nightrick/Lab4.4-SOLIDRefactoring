import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie implements Play {
	
	String title;
	int runTime;
	ArrayList<String> scenes;
	int iPlay;
	int currentTime;

	public Movie(String title, int runTime, ArrayList<String> scenes, int iPlay) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.iPlay = iPlay;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	public int getiPlay() {
		return iPlay;
	}

	public void setiPlay(int iPlay) {
		this.iPlay = iPlay;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	public void printInfo() {
		System.out.println("Movie title: " + title + "Runetime: " + runTime);
	}
	
	public void printScenes() {
		for(int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + i + ": " + scenes.get(i));		
		}
	}
	
	public void play() {
		play(scenes);
	}

	@Override
	public void play(List<String> scenes) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("What scene would you like to view? (0-" + (scenes.size()-1) + "): ");
		iPlay=scnr.nextInt();
		setiPlay(iPlay);
		
		System.out.println("Scene " + iPlay + ": " + scenes.get(iPlay));
		currentTime++;
	}
 
}

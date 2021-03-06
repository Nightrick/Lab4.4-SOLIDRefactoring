import java.util.ArrayList;
import java.util.List;

public class VHS implements Play{
	
	int currentTime;
	String title;
	int runTime;
	ArrayList<String> scenes;
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
	
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

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
	@Override
	public String toString() {
		return "Title; " + title + " Runetime: " + runTime;
	}

	@Override
	public void play(List<String> scenes) {
		if(currentTime > (scenes.size() - 1)) {
			rewind();
		}
		
		System.out.println("Current time " + currentTime + ", Scene: " + scenes.get(currentTime));
		currentTime++;
		
	}
}

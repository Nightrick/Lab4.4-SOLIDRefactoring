import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD implements Play{
	
	int sceneSelection;
	String title;
	int runTime;
	ArrayList<String> scenes;
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		
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

	public int getSceneSelection() {
		return sceneSelection;
	}

	public void setSceneSelection(int sceneSelection) {
		this.sceneSelection = sceneSelection;
	}

	Scanner scnr = new Scanner(System.in);
	
	@Override
	public String toString() {
		return "Title; " + title + " Runetime: " + runTime;
	}

	@Override
	public void play(List<String> scenes) {
		System.out.println("Which of the following scenes would you like to view?");
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Selection: " + i + ". " + scenes.get(i));
		}
		
		System.out.print("Please select a scene: ");
		sceneSelection = scnr.nextInt();
		System.out.println ("You selected scene " + sceneSelection + ": " + scenes.get(sceneSelection));
	}
	

}

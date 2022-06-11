import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BlockbusterJUnitTesting {

	@Test
	void testDVDInstanceCreation() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		DVD dvd1 = new DVD("Planet of the Apes", 183, apeScenes);
		
		assertEquals(dvd1.toString(), new DVD("Planet of the Apes", 183, apeScenes).toString());
	}
	
	@Test
	void testDVDTitleSetter() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		DVD dvd1 = new DVD("Planet of the Apes", 183, apeScenes);
		dvd1.setTitle("PoA");
		
		assertEquals("PoA", dvd1.getTitle());
	}
	
	@Test
	void testDVDRuntimeSetter() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		DVD dvd1 = new DVD("Planet of the Apes", 183, apeScenes);
		dvd1.setRunTime(190);
		
		assertEquals(190, dvd1.getRunTime());
	}
	
	@Test
	void testVHSInstanceCreation() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		
		assertEquals(vhs1.toString(), new VHS("Planet of the Apes", 183, apeScenes).toString());
	}
	
	@Test
	void testVHSTitleSetter() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		vhs1.setTitle("PoA");
		
		assertEquals("PoA", vhs1.getTitle());
	}
	
	@Test
	void testVHSRuntimeSetter() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		vhs1.setRunTime(190);
		
		assertEquals(190, vhs1.getRunTime());
	}
	
	@Test
	void testVHSCurrentTimeSetPoint() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		
		assertEquals(0, vhs1.getCurrentTime());
	}
	
	@Test
	void testVHSPlayMethod() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		vhs1.play(apeScenes);
		vhs1.play(apeScenes);
		vhs1.play(apeScenes);
		
		assertEquals(3, vhs1.getCurrentTime());
	}
	
	
	@Test
	void testVHSRewindMethod() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		vhs1.setCurrentTime(3);
		vhs1.rewind();
		
		
		assertEquals(0, vhs1.getCurrentTime());
	}
	
	@Test
	void testVHSRewindMethod2() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		VHS vhs1 = new VHS("Planet of the Apes", 183, apeScenes);
		vhs1.play(apeScenes);
		vhs1.play(apeScenes);
		vhs1.play(apeScenes);
		vhs1.play(apeScenes);
		
		assertEquals(1, vhs1.getCurrentTime());
	}
	
	@Test
	void testMoviePlayMethod() {
		
		ArrayList<String> apeScenes = new ArrayList<>(Arrays.asList("Apes are poor", "Apes take over Planet", "Holy sh@t, the statue of liberty is an ape??"));
		
		Movie movie1 = new Movie("Planet of the Apes", 183, apeScenes, 0);
		movie1.play();
		movie1.play();
		
		assertEquals(2, movie1.getCurrentTime());
	}
	

}

package museumNavigation;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Visit {
//Modification is to be ended			

	private static ArrayList<Area> areas;

	public Visit(){
		areas.add(new Area("Barocco", null, null));
		areas.add(new Area("Bruhrocco", null, null));
	}

	public static ArrayList<Area> returnAreas(){
		areas.add(new Area("Barocco", null, null));
		return areas;
	}

	public void showAreas() {
		
	}

	public Area selectArea() {
		Area a = new Area(null, null, null);
		return a;
	}

	public void exitArea() {
		
	}

	public void selectArtwork() {
		
	}
	public void exitArtwork() {
		
	}

	public void endVisit() {
		
	}
}

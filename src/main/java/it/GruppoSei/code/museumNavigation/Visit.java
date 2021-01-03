package it.GruppoSei.code.museumNavigation;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Visit {
//Modification is to be ended			

	private static ArrayList<Area> areas;

	public Visit(){
	}

	public static ArrayList<Area> returnAreas(){
		return areas;
	}

	public void showAreas() {
		
	}

	public Area selectArea() {
		return null;
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

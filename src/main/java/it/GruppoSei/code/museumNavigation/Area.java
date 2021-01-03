package it.GruppoSei.code.museumNavigation;
import java.util.ArrayList;

public class Area{

	private String areaName;
	private String areaStyle;
	private ArrayList<Artwork> artworks;
	private int areaCuratorId;
	private boolean isAccessible  =true;
	
	protected Area() {}

	public Area(String areaName, String areaStyle, int areaCuratorId){
		this.areaName = areaName;
		this.areaStyle = areaStyle;
		this.areaCuratorId = areaCuratorId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaStyle() {
		return this.areaStyle;
	}

	public void setAreaStyle(String areaStyle) {
		this.areaStyle = areaStyle;
	}

	public ArrayList<Artwork> getArtworks() {
		return this.artworks;
	}

	public void setArtworks(ArrayList<Artwork> artworks) {
		this.artworks = artworks;
	}

	public int getAreaCuratorId(){
		return this.areaCuratorId;
	}
	
	public void setIsAccessible(boolean accessible){
		this.isAccessible = accessible;
	}
	
	public boolean getIsAccessible(){
		return this.isAccessible;
	}
	
	public void addArtwork(Artwork artwork){
		this.artworks.add(artwork);
	}
	
	public void deleteArtwork(Artwork artwork){
		this.artworks.remove(artwork);
	}
}

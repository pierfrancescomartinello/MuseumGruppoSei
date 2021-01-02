package museumNavigation;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import museumUtil.Utilities;

public class Artwork {

	//reminder Date is to be changed with Calendar
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int artworkId;
	

	private String name;
	private String author;
	private LocalDate date;
	private String simpleDescription;
	private String completeDescription;
	private Area area; 
	
	protected Artwork() {}
	
	public String getName() {
		return this.name;
	}

	public int getArtworkId() {
		return this.artworkId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(int dd, Month MMM, int yyyy){
		this.date = Utilities.LocalDateCreator(dd, MMM, yyyy);
	}

	public Area getArea(){
		return this.area;
	}

	public void setArea(Area area){
		this.area = area;
	}

	public String getSimpleDescription() {
		return this.simpleDescription;
	}

	public void setSimpleDescription(String simpleDescription) {
		this.simpleDescription = simpleDescription;
	}

	public String getCompleteDescription() {
		return this.completeDescription;
	}

	public void setCompleteDescription(String completeDescription) {
		this.completeDescription = completeDescription;
	}

}

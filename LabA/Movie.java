/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package LabA;

/**
 * Responsibility: Hold information about any ONE movie.
 */
public class Movie {
	
	private Integer id;
	private String title;
	private String category;
	private String description;
	private int year;
	private String rating;
	private boolean isBlackAndWhite;
	private String origin;

	public Movie() {
	}

	// Constructor
	public Movie(String t, String c) {
		title = t;
		category = c;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// getter
	public String getTitle() {
		return title;
	}

	// getter
	public String getCategory() {
		return category;
	}

	// getter
	public String getDescription() {
		return description;
	}
	
	// getter
	public int getYear() {
		return year;
	}
	
	// getter
	public String getRating() {
		return rating;
	}
	
	// getter
	public boolean getIsBlackAndWhite() {
		return isBlackAndWhite;
	}
	
	// getter
	public String getOrigin() {
		return origin;
	}

	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	// setter
	public void setCategory(String category) {
		this.category = category;
	}

	// setter
	public void setDescription(String description) {
		this.description = description;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	
	// setter
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	// setter
	public void setIsBlackAndWhite(boolean isBlackAndWhite) {
		this.isBlackAndWhite = isBlackAndWhite;
	}
	
	// setter
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}

}

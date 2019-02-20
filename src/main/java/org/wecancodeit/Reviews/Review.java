package org.wecancodeit.Reviews;

public class Review {

	private long id;
	private String name;
	private String description;
	private String image;

	public Review(long id, String name, String description, String image) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getImage() {
		return image;
	}

}

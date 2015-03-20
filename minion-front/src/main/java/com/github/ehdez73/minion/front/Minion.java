package com.github.ehdez73.minion.front;

import java.io.Serializable;

public class Minion implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String image;
	
	public Minion(){
		super();
	}
	
	public Minion(String name, String image) {
		super();
		this.name = name;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}

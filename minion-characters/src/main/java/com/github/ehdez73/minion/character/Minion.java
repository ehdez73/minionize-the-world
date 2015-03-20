package com.github.ehdez73.minion.character;

import java.util.Random;

public class Minion {
	
	private static Random random = new Random();
	private static final Minion[] minions= {
			new Minion("Carl",   "img/minion-carl.jpg"),
			new Minion("Dave",   "img/minion-dave.jpg"),
			new Minion("Tom",    "img/minion-tom.jpg"),
			new Minion("Tim",    "img/minion-tim.jpg"),
			new Minion("Kevin",  "img/minion-kevin.jpg"),
			new Minion("Stuart", "img/minion-stuart.jpg"),
			new Minion("Phil",   "img/minion-phil.jpg"),
			new Minion("Wolverine", "img/minion-wolverine.jpg")
		};
			
	
	
	public static Minion random(){
		int index = random.nextInt(minions.length);
		return minions[ index];
	}
	
	private String name;
	private String image;
	
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
	
	public String toString(){
		return "[name: " + name + ", Image: " + image +"]";
	}
	
	
}

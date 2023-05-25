package model_b_xml;

public class Bike {

	String name;
	int cc;
	MusicSystem sonymusic;
	
	
	
	public Bike(String name, int cc, MusicSystem sonymusic) {
		super();
		this.name = name;
		this.cc = cc;
		this.sonymusic = sonymusic;
	}



	@Override
	public String toString() {
		return "Bike [name=" + name + ", cc=" + cc + ", MusicSystem=" + sonymusic + "]";
	}
	
	
	
	
}

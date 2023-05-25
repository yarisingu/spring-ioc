package model_b_xml;

public class Car {

	
	
	String brand;
	int toSpeed;
	MusicSystem sonymusic;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getToSpeed() {
		return toSpeed;
	}
	public void setToSpeed(int toSpeed) {
		this.toSpeed = toSpeed;
	}
	
	
	public MusicSystem getSonymusic() {
		return sonymusic;
	}
	public void setSonymusic(MusicSystem sonymusic) {
		this.sonymusic = sonymusic;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", toSpeed=" + toSpeed + ", sonymusic=" + sonymusic + "]";
	}
	
	
	
}

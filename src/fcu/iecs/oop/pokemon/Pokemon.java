package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	
	Pokemon(String name, int cp){
		this.name = name;
		this.cp = cp;
	}
	public Pokemon(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getCp(){
		return cp;
	}
	public void setCp(int cp){
		this.cp = cp;
	}
	
}

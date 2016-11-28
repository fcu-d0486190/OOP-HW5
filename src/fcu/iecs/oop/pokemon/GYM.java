package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		boolean j;
		int cp = 0;
		int i = (int)(Math.random()*2);
		if(i == 1){
			j = true;
		}
		else{
			j = false;
		}
		if(j){
			System.out.println("Winner is "+p1.getName());
			cp = p1.getCp();
			p1.setCp(cp+100);
		}
		else{
			System.out.println("Winner is "+p2.getName());
			cp = p2.getCp();
			p2.setCp(cp+500);
		}
	}

}

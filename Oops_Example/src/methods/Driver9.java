package methods;
/**
 * Write a java method which will return player data based on player id
 * player data ---- id /name /age
 * 7:Dhoni
 * 18:virat
 * 45:rohit
 */

public class Driver9 {
	Player get(int id) {
		Player p= new Player();
		if(id==7) {
			p.id=7;
			p.age=26;
			p.name="Dhoni";
		}else if(id==18) {
			p.id=18;
			p.age=45;
			p.name="Virat";
		}else if(id==45) {
			p.id=45;
			p.age=36;
			p.name="rohit";
		}
		return p;	
	}

	public static void main(String[] args) {
		Driver9 d=new Driver9();
		Player player = d.get(18);
		System.out.println(player.id+" |"+player.age+"| "+player.name);
	}
}

class player{
	int id;
	int age;
	String name;	
}
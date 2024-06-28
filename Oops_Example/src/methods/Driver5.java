package methods;
/**
 * take player class with playerId, playertAge ,playerName as properties
 * create driver class with print method to print player data
 */

public class Driver5 {
	void print(Player p) {
		System.out.println("PlayerId:"+p.id+" |PlayerAge:"+p.age+" |PlayerName:"+p.name);
	}

	public static void main(String[] args) {
		Driver5 d=new Driver5();
		Player player=new Player();
		player.id=101;
		player.age=25;
		player.name="rohit";
		d.print(player);

	}

}

class Player{
	int id;
	int age;
	String name;
}

/* This class test things
 * @author Alex Aguilan 
 * Version ¯\_('_')_/¯
 */


public class Test2 implements Test3{
	private int health;
	private int damage;
	private String playerName;
	private int level;
	private String role;
	
	//gets characters hp
	public String getHealth() {
		return "HP:" + health;
	}
	//gets characters dmg
	public String getDamage() {
		return "DMG:" + damage;
	}
	//gets characters name
	public String getName() {
		return role + ":" + playerName;
	}
	//gets characters level
	public String getLevel() {
		return "Level:" + level;
	}
	//sets characters hp
	public void setHealth(int hp) {
		this.health = hp;
	}
	//sets damage
	public void setDamage(int dps) {
		this.damage = dps;
	}
	//sets char name
	public void setName(String name) {
		this.playerName = name;
	}
	//sets level
	public void setLevel(int cLevel) {
		this.level = cLevel;
	}
}



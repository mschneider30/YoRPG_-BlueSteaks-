public class Protagonist extends Character{
public String name;
// public int health;
// public int damage;
// public int taken;
// public double damageM;
// public double takenM;
public Protagonist (String g) {
health = 125;
strength = 100;
defense = 40;
attack = .4;
name = g;
}
// public boolean isAlive () {
// return (health > 0);
// }
// public int attack (Monster g) {
// damage =  (int)(Math.random()*10*damageM);
// taken = (int)(Math.random()*10*takenM);
// g.health = g.health - damage;
// return damage;
// }
 public void specialize () {
   strength=200;
   defense=20;
 }
 public void normalize () {
 strength=100;
 defense=20;
 }
 public String getName() {
 return name;
 }
}

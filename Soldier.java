public class Soldier extends Protagonist{
  public Soldier (String g) {
    health = 100;
    strength = (int)(Math.random()*60);
    defense = 10;
    attack = .75;
    name = g;
  }

}

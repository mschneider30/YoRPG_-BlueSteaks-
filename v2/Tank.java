public class Tank extends Protagonist{
  public Tank (String g) {
    health = 150;
    strength = (int)(Math.random()*60);
    defense = 15;
    attack = .25;
    name = g;
  }

}

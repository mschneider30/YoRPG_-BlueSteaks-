public class Warrior extends Protagonist{
  public Warrior (String g) {
  health = 62;
  strength = 200;
  defense = 20;
  attack = .8;
  name = g;
  }
   public void specialize () {
     strength=400;
     defense=10;
   }
   public void normalize () {
   strength=200;
   defense=20;
   }
}

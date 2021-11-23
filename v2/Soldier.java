public class Soldier extends Protagonist{
  public Soldier (String g) {
  health = 125;
  strength = 100;
  defense = 40;
  attack = .4;
  name = g;
  }
   public void specialize () {
     strength=200;
     defense=20;
   }
   public void normalize () {
   strength=100;
   defense=40;
   }
}

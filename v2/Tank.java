public class Tank extends Protagonist{
  public Tank (String g) {
  health = 250;
  strength = 50;
  defense = 80;
  attack = .2;
  name = g;
  }
   public void specialize () {
     strength=100;
     defense=40;
   }
   public void normalize () {
   strength=50;
   defense=80;
   }
}

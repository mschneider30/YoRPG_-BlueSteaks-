public class Protagonist extends Character{
protected String name;

 public String getName() {
 return name;
 }
public void specialize () {
strength = strength * 2;
defense = defense / 2;
}
public void normalize () {
strength = strength / 2;
defense = defense * 2;
}
}

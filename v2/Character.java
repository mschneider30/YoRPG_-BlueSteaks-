public class Character {
  protected int health;
  protected int strength;
  protected int defense;
  protected double attack;

  public boolean isAlive(){
    return health > 0;
  }

}

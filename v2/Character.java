public class Character {
  public int health;
  public int strength;
  public int defense;
  public double attack;

  public boolean isAlive(){
    return health > 0;
  }
  public int getDefense () {
    return defense;
  }
  public void lowerHP (int damage) {
    health = health - damage;
  }
  public int attack (Character target) {
    double chance = Math.random()/2 + .5;
    int damage = (int)(chance*((double)strength*attack))-target.defense;
    if (damage < 0) {
      damage = 0;
    }
    target.lowerHP(damage);
    return damage;
  }
}

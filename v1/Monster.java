public class Monster extends Character{

public Monster () {
health = 150;
strength = 20 + (int)(Math.random() * 45);
defense = 20;
attack = 1;
}
// public boolean isAlive (){
// return (health > 0);
// }
// public int attack (Protagonist g){
// g.health = g.health - g.taken;
// return g.taken;
// }
}

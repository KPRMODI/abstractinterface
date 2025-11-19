abstract class Enemy {
 
    // Add protected instance variables:
    // health, damage, name
    protected int health;
    protected int damage;
    protected String name;

    // Create a constructor that initializes all fields
    public Enemy(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }




    // Declare abstract methods:
    // update()
    // attack()
    abstract void update();
 
    abstract void attack();
    // Create a concrete takeDamage(int amount) method

    void takeDamage (int amount){
        System.out.println(name + " takes " + amount + " damage! Remaining health: " + (health-amount));
    }
    // Add a getName() method
        public String getName(String name){
        return name;
    }
}

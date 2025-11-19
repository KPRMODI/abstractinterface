public class Dragon extends Enemy{
 
    // Create constructor (call super)
    public Dragon(int health, int damage, String name){
        super(health, damage, name);
    }
    // Implement update()
    @Override
    void update(){
        System.out.println(name + " flies through the air!");
    }
    // Implement attack()
    @Override
    void attack(){
        System.out.println(name + " sprays fire on you!");
    }
}
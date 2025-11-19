// Extend Enemy

public class Skeleton extends Enemy{
 
    // Create constructor (call super)
    public Skeleton(int health, int damage, String name){
        super(health, damage, name);
    }
    //Implement update()
    @Override
    void update(){
        System.out.println(name + " moniters the area with secrecy");
    }
    // Implement attack()
    @Override
    void attack(){
        System.out.println(name + " fires a flurry of bones at you!");
    }
}
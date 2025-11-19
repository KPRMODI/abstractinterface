// Extend Enemy

public class Slime extends Enemy{
    // Create constructor
    // Must call super(...)
    public Slime(int health, int damage, String name){
            super(health, damage, name);
    }
 
    // Implement update()
    @Override
    void update(){
        System.out.println(name + " wiggled closer to you!" );
    }
    // Implement attack()
        @Override
    void attack(){
        System.out.println(name +" slimed you out with a blob of acid!");
    }
}

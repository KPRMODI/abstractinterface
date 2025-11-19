public class GameDriver {
 
    public static void main(String[] args) {
 
        // Add this commented line to show that Enemy cannot be instantiated:
        // Enemy e = new Enemy();
 
        //  Create an Enemy[] array with:
        // new Slime(...)
        // new Skeleton(...)
        // new Dragon(...)
        Enemy[] enemies = {new Slime(100,100,"Jerry The Slime"
        ), new Skeleton(2000,200,"Bone God"), new Dragon(1000,2000,"Dracius")};
        int counter = 0;
        String[] titles = {"=== Jerry the Slime ===", "=== Bone God ===", "=== Dracius ==="};
        //  Loop through the array and call:
        // update(), attack(), takeDamage()
        for (Enemy e : enemies){
            System.out.println(titles[counter]);
            e.update();
            e.attack();
            e.takeDamage(5);
            System.out.println();
            counter += 1;
        }
 
        // Add reflection answers as comments at the bottom of this file
    }
}
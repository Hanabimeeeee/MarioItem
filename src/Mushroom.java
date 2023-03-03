public class Mushroom extends Item{
    
    @Override
    public void show(){
        setAppear(true);
        System.out.println("Block is cracked! Mushroom is appearing!");
    }

      /**
     * 
     * @param distance between current location to new location
     */
    public void run(int[] distance){
        if(getAppear()){
            int[] currentLocation = getLocation();
            System.out.println("Mushroom is at "+ currentLocation[0]+ "," + currentLocation[1]);
            System.out.println("Mushroom is runing!");
            currentLocation[0] = currentLocation[0]+ distance[0];
            currentLocation[1] = currentLocation[1]- distance[1];
            setLocation(currentLocation);
            System.out.println("Mushroom is at "+currentLocation[0]+","+currentLocation[1]);
        }else {System.out.println("Mushroom is disappear!");}
    }

    @Override
    public String toString() {
        return "Mushroom []";
    }

}

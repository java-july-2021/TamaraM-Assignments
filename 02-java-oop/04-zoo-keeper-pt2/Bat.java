public class Bat extends Mammal{
    public Bat(){
        super("Bat", 300);
    }
    
    public void attackTown(){
        System.out.println("Fire,fire,fire!");
        this.de-=100;
        
    }
    public void eatHumans(){
        System.out.println("So- well, never mind");
        this.de+=25;

    }
    public void fly(){
        System.out.println("Swoosh, swoosh, swoosh");
        this.de-=50;
    }
    public int displayEnergy(){
        System.out.println("Bat's energy is " + this.de);
        return this.de;
    }
}
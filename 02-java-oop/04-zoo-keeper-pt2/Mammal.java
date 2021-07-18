public class Mammal {
    public String species;
    public int de;
    
    public Mammal(String species, int de){
        this.species=species;
        this.de=de;
    }

    public void energy(int de){
    this.de=de;
    }

    public int getDe(){
        return this.de;
    }
    
}

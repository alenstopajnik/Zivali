package zivali;
public class Pes extends Zival {
    private String pasma;
    private int sitost;

    public Pes(String ime, int starost, String barva, String pasma, int sitost){
        super(ime, starost, barva);
        this.pasma=pasma;
        this.sitost=sitost;
    }

    public String getPasma(){
        return pasma;
    }

    public int getSitost() {
        return sitost;
    }
        
    public void lajanje() {
        System.out.println("Woof woof!");
    }  

    public boolean lakota() {
        return sitost < 4;
    }

    public void nahrani() {
        if (lakota()) {
            sitost = 10;
        }
    }

    public void sprehod() {
        if (lakota()) return;
            sitost -= 5;
    }

    public String toString(){
        return sitost;
    }
    
}

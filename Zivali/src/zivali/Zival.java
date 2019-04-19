package zivali;
public class Zival {
    private String ime;
    private String barva;
    private int starost;

    public Zival(String ime, int starost, String barva){
        this.ime=ime;
        this.starost=starost;
        this.barva=barva;
    }

    public Zival(){}

    public String getIme() {
	    return ime;
    }

    public int getStarost() {
        return starost;
    }

    public String getBarva() {
	    return barva;
    }    
}

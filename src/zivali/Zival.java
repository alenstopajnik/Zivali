package zivali;
public class Zival {
    private String ime; /* Spremenljivke */
    private int starost;

    public Zival(){} /* Privzeti konstruktor */

    public Zival(String ime, int starost){ /* Konstruktor */
        this.ime=ime;
        this.starost=starost;
    }

    public String getIme() { /* Dostopne metode */
	    return ime;
    }

    public int getStarost() {
        return starost;
    }

    public void setIme() {
        this.ime=ime;
    }

    public void setStarost() {
        this.ime=ime;
    }

    public String toString() { /* Program izpise ime in starost. */
        return ("Ime je " + ime + ", starost je " + starost + ".");
    }
}

package zivali;
public class Pes extends Zival {
    private double masa;
    private int casSprehodov;
    private int steviloObrokov;

    public Pes(String ime, int starost, double masa, int casSprehodov, int steviloObrokov ){
        super(ime, starost);
        this.masa=masa;
        this.casSprehodov=casSprehodov;
        this.steviloObrokov=steviloObrokov;
    }

    public double getMasa(){
        return masa;
    }

    public double getCasSprehodov(){
        return casSprehodov;
    }

    public int getSteviloObrokov(){
        return steviloObrokov;
    }

    public double vrednostRER(){ /* Izracun vrednosti RER (Resting Energy Requirement), ki je odvisen od mase psa. */
       return ( 70 * (Math.pow(getMasa(), 0.75)) );
    }

    public boolean mladic(){ /* Program preveri ali je pes mladic (mlajsi od dveh let) */
        return getStarost() < 2;
    }

    public double mnozenec(){ /* Ce je pes mladic, se uporabi visja vrednost, saj potrebuje vec kalorij za svojo rast. */
        if (mladic()){
            return 2.2;
        }
        else{
            return 1.6;
        }
    }
    
    public double priporocenDnevniVnosKalorij(){ /* Program izracuna priporocen dnevni vnos kalorij za psa. */
        return mnozenec() * vrednostRER();
    }

    public double porabaKalorij(){ /* Program izracuna koliko kalorij pes porabi na sprehodu. Poraba je odvisna od mase in trajanja sprehoda. */
        return getCasSprehodov() * ((getMasa() * 64) / 10);
    }

    public double kalorijeNaObrok(){ /* Program izracuna koliko kalorij mora vsebovati posamezen obrok. */
        return ( ( porabaKalorij() + priporocenDnevniVnosKalorij() ) / getSteviloObrokov() );
    }   
}

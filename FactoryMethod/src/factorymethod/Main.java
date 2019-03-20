package factorymethod;

public class Main {

    public static void main(String[] args) {
        
    	AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus talkkari = new Talonmies();
        
        opettaja.aterioi();
        oppilas.aterioi();
        talkkari.aterioi();
        
    }
}

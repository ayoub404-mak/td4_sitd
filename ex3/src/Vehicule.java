public class Vehicule {
    private String marque ;
    private int vitesse;

    public Vehicule(){

    }
    public Vehicule(String marque,int vitesse){
        set_marque(marque);
        set_vitesse(vitesse);
    }
    public void set_marque(String marque){
        this.marque=marque;
    }
    public String get_marque(){
        return marque;
    }
    public void set_vitesse(int vitesse){
        System.out.println("nta f set sup-class");
        this.vitesse=vitesse;
    }
    public int get_vitesse(){
        System.out.println("nta f get sup-class");
        return vitesse;
    }
    public void afficher(){
        System.out.println("marque : "+get_marque()+" | vitesse : "+get_vitesse());
    }
}

public class Voiture extends Vehicule{
    private int vitesse;
    private int nbPortes;

    public Voiture(){

    }
    public Voiture(String marque,int vitesse,int nbPortes){
        set_marque(marque);
        set_vitesse(vitesse);
        set_nbPortes(nbPortes);
    }
    public void set_vitesse(int vitesse){
        System.out.println("nta f set sub-class");
        this.vitesse=vitesse;
    }
    public int get_vitesse(){
        System.out.println("nta f get sub-class");
        return vitesse;
    }
    public void set_nbPortes(int nbPortes){
        this.nbPortes=nbPortes;
    }
    public int get_nbPortes(){
        return nbPortes;
    }
    public void afficher(){
        System.out.println("marque : "+get_marque()+" | vitesse : "+get_vitesse()+" | nbrPortes : "+get_nbPortes());
    }
}

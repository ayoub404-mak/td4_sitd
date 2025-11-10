public class Personne {
    private String nom;
    private String prenom;

    //public Personne(){}
    public Personne (String nom,String prenom){
        set_nom(nom);
        set_prenom(prenom);
        
    }

    public void set_nom(String nom){
        this.nom=nom;
    }
    public String get_nom(){
        return nom;
    }
    public void set_prenom(String prenom){
        this.prenom=prenom;
    }
    public String get_prenom(){
        return prenom;
    }

    
    public void afficher(){
        System.out.println("nom: "+get_nom()+" | prenom: "+get_prenom());
    }

}

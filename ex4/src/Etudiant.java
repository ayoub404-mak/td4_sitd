public class Etudiant extends Personne {
    private String filiere;
    
    public Etudiant(String nom,String prenom,String filiere){
        super(nom, prenom);
        set_filiere(filiere);
        System.out.println("nta f const etu");
    }

    public void set_filiere(String filiere){
        System.out.println("nta f setfili");
        this.filiere=filiere;
    }
    public String get_filiere(){
        System.out.println("nta f setfili");
        return filiere;
    }
    public void afficher(){
        System.out.println("nom: "+get_nom()+" | prenom: "+get_prenom()+" | filiere: "+get_filiere());
    }

}

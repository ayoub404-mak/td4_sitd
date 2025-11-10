public class Employe {
    private String nom;
    private double salaire;

    protected double tauxImposition; 

    public Employe(){

    }
    public Employe(String nom,double salaire){
        setnom(nom);
        setsalaire(salaire);
    }
    public double gettauxImposition(){
        return tauxImposition;
    }
    public String getnom(){
        return nom;
    }
    public double getsalaire(){
        return salaire;
    }
    public void settauxImposition(double tauxImposition){
        this.tauxImposition=tauxImposition;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public void setsalaire(double salaire){
        this.salaire=salaire;
    }
    public String afficherInfos(){
        return "nom : "+nom+" | salaire : "+salaire+" | tauxImposition: "+tauxImposition;
    }
    protected double calculerImport(){
        return salaire*tauxImposition;
    }

}

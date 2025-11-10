public class Employe {
    private String nom;
    private double salaire;

    public Employe(){

    }
    public Employe(String nom,double salaire){
        setnom(nom);;
        setsalaire(salaire);;
    }

    public String getnom(){
        return nom;
    }
    public double getsalaire(){
        return salaire;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public void setsalaire(double salaire){
        this.salaire=salaire;
    }
    public String afficherInfos(){
        return "nom : "+nom+" | salaire : "+salaire;
    }

}

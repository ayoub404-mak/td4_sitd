public class mainEmploye {
    public static void main(String [] rags){

        Employe e1 = new Manager("hicham",120, 10);
        Employe e2 = new Manager();
        System.out.println(e1.afficherInfos());
        System.out.println(e2.afficherInfos());
    }
    
}
class Manager extends Employe {
    private double prime ;


    public Manager(){
        
    }
    public Manager(String nom, double salaire,double prime){
        super(nom,salaire);
        setprime(prime);
        tauxImposition=50;  

    }
    public void setprime(double prime){
        this.prime=prime;
    }
    public Double getprime(){
        return prime;
    }

    public String afficherInfos(){
        return super.afficherInfos()+" | prime : "+prime+ " | salaire net: "+salaireNet();
    }
    public double salaireNet(){
        return getsalaire()+getprime()-calculerImport();
    }

    }
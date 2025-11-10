import java.util.ArrayList;

public class mainEmploye {
    public static void main(String[] args) {
        ArrayList<Employe> list1 =new ArrayList<>();
        Employe p1=new Employe("ahmade ",2000);
        //mainEmploye e = new mainEmploye();
        Employe p2=new Manager("hem",3456,344);
        Employe p3=new Technicien("sim",9696,"info");
        //System.out.println(p1.afficherInfo());
        //System.out.println(p3.afficherInfo());

        list1.add(p1);
        list1.add(p2);
        list1.add(p3);

        for(Employe aff:list1){
            System.out.println(aff.afficherInfos());
        }
    }
}
    //----------------------------------------------------------------------------
     class Manager extends Employe {
    private double prime ;
    
    public Manager(){
        
    }
    public Manager(String nom, double salaire,double prime){
        super(nom,salaire);
        setprime(prime);

    }
    public void setprime(double prime){
        this.prime=prime;
    }
    public Double getprime(){
        return prime;
    }

    public String afficherInfos(){
        return super.afficherInfos()+" | prime : "+prime;
    }

    }


    //----------------------------------------------------------------------------------
     class Technicien extends Employe{
        private String specialite ;

        public Technicien(){

        }
        public Technicien(String nom, double salaire,String specialite ){
            super(nom,salaire);
            setspecialite(specialite);

        }

        public void setspecialite(String specialite){
            this.specialite=specialite;
        }
        public String getspecialite(){
            return specialite;
        }
        public String afficherInfos(){
            return super.afficherInfos()+" | specialite : "+specialite;
        }

    }


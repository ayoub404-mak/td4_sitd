public class Produit {
    private int code;
    private String designation ;
    private double prix;


    public Produit(){}
    public Produit(int code,String designation,double prix){
        this.code=code;
        this.designation=designation;
        this.prix=prix;
    }


    public void setcode(int code){
        this.code=code;
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    public void setprix(int prix){
        this.prix=prix;
    }

    public int getcode(){
        return code;
    }
    public String getdesignation(){
        return designation;
    }
    public double getprix(){
        return prix;
    }


    public void afficher(){
        System.out.print("code: "+code+" designation: "+designation+" prix: "+prix);
    }

}

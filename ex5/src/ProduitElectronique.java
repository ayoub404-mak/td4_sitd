public class ProduitElectronique extends Produit{
    private int garantie;// en moi

    public ProduitElectronique(int code,String designation,double prix,int garantie){
        super(code,designation,prix);
        this.garantie=garantie;
    }
    public void afficher(){
        super.afficher();
        System.out.println(" garantie: "+garantie);
    }
    public int getgarantie(){
        return garantie;
    }

}

import java.time.LocalDate;
import java.util.Date;

public class ProduitAlimentaire extends Produit{
    private LocalDate datePeremption;
    

    public ProduitAlimentaire(int code,String designation,double prix,LocalDate datePeremption){
        super(code, designation, prix);
        this.datePeremption=datePeremption;
    }



    public void afficher(){
        super.afficher();
        System.out.print("datePeremption : " +datePeremption);
    }

    public boolean estPerime(){
        return LocalDate.now().isAfter(datePeremption);
    }
    public LocalDate getDataPeremption(){
        return datePeremption;
    }
}

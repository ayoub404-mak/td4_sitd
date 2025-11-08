import java.util.HashSet;

public class mainPersonne {
    public static void main(String[] args) {
        //--------------------MEAN FOR EDUCATON AND MENTAL HEALTH-------------------
        // 3LAX SUB-class mhtaja wahd constructure par defaut par default mn sup-class bax trdam
        //solution : dir constructeur l etudent marask hta rhir
        HashSet<Personne> set1 =new HashSet<>();
        Personne p1 =new Personne("ahmad", "foad");
        Personne p2=new Etudiant("majd","kamal","computer science");
        set1.add(p1);
        set1.add(p2);
        for (Personne h : set1){
            h.afficher();
        }
    }
}

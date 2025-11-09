import java.util.List;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        societe.ajouterEmploye(new Employe(3, "JDI", "Yosra", "Informatique", 2));
        societe.ajouterEmploye(new Employe(1, "JDI", "Yosri", "Informatique", 3));

        System.out.println("tout les employés : ");
        societe.displayEmploye();

        System.out.println("departement info");
        List<Employe> infos = societe.rechercherParDepartement("Informatique");
        for (Employe e : infos) {
            System.out.println(e);
        }
        System.out.println("departement rh");
        List<Employe> rhs = societe.rechercherParDepartement("RH");
        for (Employe e : rhs) {
            System.out.println(e);
        }
    }

}
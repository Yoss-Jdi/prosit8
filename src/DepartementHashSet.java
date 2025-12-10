import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    };

    @Override
    public boolean rechercherDepartement(String nomDepartement){
        for (Departement d : departements){
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement))
                return true;
        }
        return false;
    };

    @Override
    public boolean rechercherDepartement(Departement d){
        return departements.contains(d);
    };

    @Override
    public void supprimerDepartement(Departement d){
        departements.remove(d);
    };

    @Override
    public void afficherDepartements(){
        Iterator it = departements.iterator();
        while(it.hasNext()){
            Departement d = (Departement)it.next();
            d.toString();
        }
    };

    @Override
    public void trierDepartementsParId(){
        Set<Departement> dep = (TreeSet) departements;

        for (Departement d : dep){
            d.toString();
        }
    };

    @Override
    public void trierDepartementsParNomEtNombreEmployes(){
        NombreEmpComparator nbrComp = new NombreEmpComparator();
        NameComparator nameComp = new NameComparator();

        List listdepartements = new  ArrayList<>(departements);

        Collections.sort(listdepartements, nbrComp);
        Collections.sort(listdepartements,nameComp);





    }
}

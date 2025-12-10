import java.util.ArrayList;
import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe>{

    private List<Employe> employees = new ArrayList<>();


    @Override
    public void ajouterEmploye(Employe employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom){
        for (Employe e : employees){
            if ((e.getNom().toUpperCase() ).equals( nom.toUpperCase())){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe employee) {
        return employees.contains(employee);

    }
    @Override
    public void supprimerEmploye(Employe employee){
        employees.remove(employee);
    }
    @Override
    public void displayEmploye(){
        for (Employe e : employees){
            System.out.println(e.toString());
        }
    }
    @Override
    public void trierEmployeParId(){//Comparable
        Collections.sort (employees);
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade(){//Comparato
        nameComparator byName = new nameComparator();
        ageComparator byAge = new ageComparator();

        Collections.sort(employees,byName);
        Collections.sort(employees,byAge);
    }


    @Override
    public List<Employe> rechercherParDepartement (String nomDepartement) {
        List<Employe> result = new ArrayList<>();

        for (Employe e : employees) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }

        return result;
    }



}

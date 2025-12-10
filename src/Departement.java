import java.util.Comparator;

public class Departement implements Comparable<Departement>{
    int id;
    String nomDepartement;
    int nombreEmployes ;

    public Departement() {
    }
    public Departement(int id, String nomDepartement, int nmobreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nmobreEmployes;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public String toString() {
        return "Dep : "+nomDepartement+"\n nombre d'employes : "+nombreEmployes;
    }

    @Override
    public boolean equals (Object o){
        //null
        //instace of
        if (o == null) return false;
        if (o instanceof Departement && this == o) return true;
        Departement departement = (Departement) o;
        if (this.id != departement.getId()) return false;
        if (this.nomDepartement != departement.getNomDepartement()) return false;

        return true;

    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }
}
class IdComparator implements Comparator<Departement> {
    public int compare(Departement o1, Departement o2) {
        return o1.getId() - o2.getId();
    }
}
class NameComparator implements Comparator<Departement> {
    public int compare(Departement o1, Departement o2) {
        return o1.getNomDepartement().compareTo(o2.getNomDepartement());
    }
}
class NombreEmpComparator implements Comparator<Departement> {
    public int compare(Departement o1, Departement o2) {
        return o1.getNombreEmployes() - o2.getNombreEmployes();
    }
}

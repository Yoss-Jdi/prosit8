public class Employe {
    int id;
    String nom;
    String prenom;
    String nomDepartement;
    int grade;

    public Employe(){}
    public Employe (int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }
    public int getId() {
        return id;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public int getGrade() {
        return grade;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "----------------\nnom complet :" + this.prenom + " " + this.nom + "\nDepartement :  " + this.nomDepartement + "\n grade : " + this.grade + "\n----------------";
    }
}

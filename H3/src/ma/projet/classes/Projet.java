/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
/**
 *
 * @author hp
 */
@Entity

public class Projet {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;
    @Column(name = "nom")
    public String nom;
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date dateFin;
     @ManyToOne
    private Employe employe;
    
    @OneToMany(mappedBy = "projet")
    private List<Tache> taches;
    public Projet() {
    }

    public Projet(String nom, Date dateDebut, Date dateFin,Employe employe) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
         this.employe = employe;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public String toString() {
        return "Projet{" + "nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", employe=" + employe + ", taches=" + taches + '}';
    }
    

    
    
    
    
}

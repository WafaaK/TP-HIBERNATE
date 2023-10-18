/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author hp
 */
@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
     @Column(name = "marque")
    public String marque;
      @Column(name = "reference")
    public String reference;
       @Column(name = "dateAchat")
    public Date dateAchat;
        @Column(name = "designation")
    public String designation;
         @Column(name = "prix")
    private double prix;

    public Produit() {
        
    }

    public Produit(String marque, String reference, Date dateAchat, String designation, double prix) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.designation = designation;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    @Override
    public String toString() {
        return "Produit [id=" + id + ", reference=" + reference + ", dateAchat=" + dateAchat +
                ", designation=" + designation + ", marque=" + marque + ", prix=" + prix + "]";
    }
    

}

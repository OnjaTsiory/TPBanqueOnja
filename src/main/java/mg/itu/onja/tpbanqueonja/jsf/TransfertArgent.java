/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.onja.tpbanqueonja.jsf;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import mg.itu.onja.tpbanqueonja.ejb.GestionnaireCompte;

/**
 *
 * @author ELITEBOOK
 */
@Named(value = "transfertArgent")
@RequestScoped
public class TransfertArgent {
    private int idSource;
    private int idDestination;
    private int montant;

    public int getIdSource() {
        return idSource;
    }

    public void setIdSource(int idSource) {
        this.idSource = idSource;
    }

    public int getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(int idDestination) {
        this.idDestination = idDestination;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    @EJB
    GestionnaireCompte gestionnaireCompte;
    
    /**
     * Creates a new instance of TransfertArgent
     */
    public TransfertArgent() {
    }
    
    public String transferer(){
        return "listeComptes?faces-redirect=true";
    }
    
}

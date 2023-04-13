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
    @EJB
    GestionnaireCompte gestionnaireCompte;
    
    /**
     * Creates a new instance of TransfertArgent
     */
    public TransfertArgent() {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.onja.tpbanqueonja.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.onja.tpbanqueonja.ejb.GestionnaireCompte;
import mg.itu.onja.tpbanqueonja.entities.CompteBancaire;

/**
 *
 * @author ELITEBOOK
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {


    private List<CompteBancaire> allComptes;
    
    @EJB
    GestionnaireCompte gestionnaireCompte;
    
        /**
     * Creates a new instance of ListeComptes
     */
    public ListeComptes() {
    }
    
    public List<CompteBancaire> getAllComptes(){
        if(allComptes == null){
            allComptes = gestionnaireCompte.getAllComptes();
        }
        return allComptes;
    }
}

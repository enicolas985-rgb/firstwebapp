package co.edu.uvpalmira.fpoe.web;
import co.edu.uvpalmira.fpoe.logica.ILogica;
import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala Sistemas
 */
@Named(value="ctrlAsignaturas")
@SessionScoped

public class ControladorAsignatura implements Serializable{
    private Asignatura asignatura = new Asignatura("750097","FPOE",(byte)2,(byte) 4);
    
    @Inject
    private ILogica logica;

    public Asignatura getAsignatura() {
        return asignatura;
    }
    public void save (){
        this.logica.crearAsignatura(asignatura);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("La asignatura fue guardada"));
    }
    
    
}

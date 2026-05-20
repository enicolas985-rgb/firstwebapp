package co.edu.uvpalmira.fpoe.web;
import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
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

    public Asignatura getAsignatura() {
        return asignatura;
    }
    
    
}

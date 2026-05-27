package co.edu.uvpalmira.fpoe.logica;


import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author enico
 */
public interface ILogica {
    public void crearAsignatura(Asignatura asignatura)throws SQLIntegrityConstraintViolationException, Exception;
    public void modificarAsignatura(Asignatura asignatura) throws SQLIntegrityConstraintViolationException, Exception;
    public Asignatura buscarAsignatura(Asignatura asignatura);
    public List<Asignatura> buscarAsignaturas();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.fpoe.modelo;


/**
 *
 * @author Sala Sistemas
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private byte creditos;
    private byte intensidad;
    public Asignatura(){}

    public Asignatura(int codigo, String nombre, byte creditos, byte intensidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.intensidad = intensidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public short getCreditos() {
        return creditos;
    }

    public short getIntensidad() {
        return intensidad;
    }
    
}

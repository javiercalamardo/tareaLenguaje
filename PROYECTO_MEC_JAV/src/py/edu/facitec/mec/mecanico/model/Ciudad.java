/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.mecanico.model;

/**
 *
 * @author Javier Guilllen
 */
//atributos
public class Ciudad {
    private String codigo;
    private String nombre;
    private String iso;
    private boolean estado;
    
    //constructores
    //constructores por defecto

    public Ciudad() {
        this.codigo = "";
        this.nombre = "";
        this.iso = "";
        this.estado = false;
    }
    //constructor por parametro

    public Ciudad(String codigo, String nombre, String iso, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.iso = iso;
        this.estado = estado;
    }
    //metodo getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}

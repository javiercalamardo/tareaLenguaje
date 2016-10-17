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
public class Cliente {
   //atributos
    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    
    private int estado;
    private Double credito;
    
    private Ciudad ciudad;
    
    //constructores
    //constructores por defecto

    public Cliente() {
        this.codigo = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.estado = 0;
        this.credito = 0d;
        this.ciudad = new Ciudad();
    }
    //constructores por parametros

    public Cliente(int codigo, String nombre, String apellido, String direccion, int estado, Double credito, Ciudad ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estado = estado;
        this.credito = credito;
        this.ciudad = ciudad;
    }
    //metodo getter y setters

    public Cliente(int codigo, String nombre, String apellido, String direccion, Double credito){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estado = estado;
        this.credito = credito;
        this.ciudad = ciudad;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
    
}

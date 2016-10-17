/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Javier Guilllen
 * Esta clase es el encargado de crear una conexion entre la BD y por ende la desconexion cuando haya terminado el trabajo
 */
public class ConexionManager {
    public static Connection conexion;//este objeto es el encargado de abrir y serrar la conexion
    public static Statement stm; //este objeto es el encargado de ejecutar la secuencia sql
    public static PreparedStatement pstm; // en una se crea el sql y ya tiene en memoria los pasos
    //static : significa que cuando se lanza el programa el ya esta disponible en la memoria para ser utilizado
    
    //crear constantes
    private static final String URL = "jdbc:postgresql://localhost:5432/bd_taller_mecanico";
    private static final String USER = "brother";
    private static final String PASSWORD = "brother";
    //final: que no cambia el programa
    
    //metodos
    public static void conectar(){
        try {
            Class.forName("org.postgresql.Driver");//esto es un puente para hablar con la base de datos Driver: es el intermediario
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);//para traer la conexion o sea abrir la sesion con la base de datos
            stm = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void desconectar(){
        if (conexion != null){
            try {
                stm.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        
    }
}
    


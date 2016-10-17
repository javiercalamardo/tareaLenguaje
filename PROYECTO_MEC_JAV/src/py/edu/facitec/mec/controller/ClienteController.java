/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.mecanico.model.Cliente;

/**
 *
 * @author Javier Guilllen
 */
public interface ClienteController {
    void regitrarCliente(Cliente cliente);
    Cliente buscarClientePorCodigo(int codigo);
    List<Cliente> buscarClientePorFiltro(String busqueda);
    boolean modificarCliente(Cliente cliente);
    void eliminarCliente(int codigo);
    
}

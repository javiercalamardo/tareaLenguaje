/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.mecanico.model.Cliente;

/**
 *
 * @author Javier Guilllen
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    Cliente buscarPorCodigo(int codigo);
    boolean modificarCliente(Cliente cliente);
    void eliminar(int codigo);
    List<Cliente>  buscarClientePorFiltro(String filtro); 
}

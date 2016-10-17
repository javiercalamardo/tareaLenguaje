/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.mecanico.model.Cliente;

/**
 *
 * @author Javier Guilllen
 */
public class ClienteControllerImpl implements ClienteController {
    //aqui se usa interface,se declara una variable
    private ClienteDao clienteDao;

    public ClienteControllerImpl() {
        //aqui se implementa la interface
        this.clienteDao = new ClienteDaoImpl();
    }
    
   
    public void regitrarCliente(Cliente cliente) {
        clienteDao.guardar(cliente);
        
    }

    @Override
    public Cliente buscarClientePorCodigo(int codigo) {
        return clienteDao.buscarPorCodigo(codigo);
        
    }

    @Override
    public List<Cliente> buscarClientePorFiltro(String busqueda) {
        return clienteDao.buscarClientePorFiltro(busqueda);
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return clienteDao.modificarCliente(cliente);
    }

    @Override
    public void eliminarCliente(int codigo) {
        clienteDao.eliminar(codigo);
    }

   

    
    
    
}

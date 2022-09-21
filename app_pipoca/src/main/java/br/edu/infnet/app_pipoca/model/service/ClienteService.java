package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Cliente;


@Service
public class ClienteService {
	
	private static Map<Integer, Cliente> mapCliente = new HashMap<Integer, Cliente>();
	private static Integer id = 1;
	
	public void incluir(Cliente cliente) {
		cliente.setId(id++);
		mapCliente.put(cliente.getId(), cliente);
	 	AppProduto.relatorio("Cliente " + cliente.getNome() + " adicionado:", cliente);
	}
	
	public void excluir(Integer id) {
		mapCliente.remove(id);
	}
	
	public Collection<Cliente> retornarLista(){
		return mapCliente.values();
	}

}

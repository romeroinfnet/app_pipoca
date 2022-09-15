package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Usuario;

@Service
public class UsuarioService {

	private static Map<String, Usuario> mapUsuario = new HashMap<String, Usuario>();
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = mapUsuario.get(email);
		
		if(usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;	
		}
		return null;
	}
	
	public void incluir(Usuario usuario) {
		mapUsuario.put(usuario.getEmail(), usuario);
	 	AppProduto.relatorio("Usuário " + usuario.getNome() + " adicionado:", usuario);
	}

	public static void excluir(String email) {
		mapUsuario.remove(email);
	}
	 	
	public static Collection<Usuario> retornarLista(){
		return mapUsuario.values();
	}

}

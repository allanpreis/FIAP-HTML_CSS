package br.com.fiap.bo;

import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class UsuarioBO {
	
	private UsuarioDAO ud = null;

	public Usuario login(Usuario u) {
		ud = new UsuarioDAO();
		return ud.select(u);
	}
	
}

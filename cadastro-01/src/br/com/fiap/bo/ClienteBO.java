package br.com.fiap.bo;

import br.com.fiap.bean.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {

	private ClienteDAO cd = null;
	
	public int cadastroCliente(Cliente cli) {
		cd = new ClienteDAO();
		return cd.insert(cli);
		
	}
}

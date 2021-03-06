package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.connection.ConnectionFactory;

public class ClienteDAO {

	private Connection con;

	public ClienteDAO() {

		ConnectionFactory cf = new ConnectionFactory();
		try {
			con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> select() {
		return null;
	}

	public Cliente select(int idCli) {
		return null;
	}

	public int insert(Cliente cli) {
		String sql = "INSERT INTO TBL_CLIENTE VALUES (SEQ_CLIENTE_A.NEXTVAL,?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, cli.getNome());
			ps.setString(2, cli.getSobrenome());
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			ps.setString(3,  sf.format(cli.getDataNasc()));
			ps.setString(4, String.valueOf(cli.getGenero()));
			ps.setString(5,  cli.getTelefone());
			
			int status = ps.executeUpdate();
					
			return status;
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return 0;
	}

	public int update(Cliente cli) {
		return 0;
	}

	public int delete(int idCli) {
		return 0;
	}
}

package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import br.com.fiap.bean.Cliente;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		ConnectionFactory cf = new ConnectionFactory();
		try {	
			Connection con = cf.DBConnectionManager();
			Cliente cli = new Client("Allan", "Reis", new SimpleDateFormat("yyyy-MM-dd").parse("2001-01-01"), 'm', "(11)");
			
			String sql = "INSERT INTO TBL_CLIENTE VALUE(SEQ_CLIENTE_A.NEXTVAL,?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, cli.getNome());
			ps.setString(2, cli.getSobrenome());
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			ps.setString(3,  sf.format(cli.getDataNasc()));
			ps.setString(4, String.valueOf(cli.getGenero()));
			ps.setString(5,  cli.getTelefone());
			
			int status = ps.executeUpdate();
			
			System.out.println("STATUS : " + status);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

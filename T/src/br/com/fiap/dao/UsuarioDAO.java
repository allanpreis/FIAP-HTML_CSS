package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fiap.bean.Usuario;
import br.com.fiap.connection.ConnectionFactory;

public class UsuarioDAO {

	private Connection con;

	public UsuarioDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario select(Usuario up) {
		
		String sql = null;
		Usuario u = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			
			// CRIANDO A INSTRUÇÃO SQL
			sql = "SELECT * FROM TBL_LOGIN WHERE NM_USER = ? AND PASS_USER = ?";
			
			// Criando a conexão
			ps = con.prepareStatement(sql);
			
			//Popular a instrução SQL.
			ps.setString(1, up.getNomeUser());
			ps.setString(2, up.getPassUser());

			//Criando o ResultSet que vai armazenar o conteúdo da consulta.
			rs = ps.executeQuery();

			// Criando uma estrutura para ler o ResultSet
			while (rs.next()) {
				// A cada iteração, será criado um novo Objeto e este será populado
				// com os dados oriundos da base de dados.
				u = new Usuario();
				u.setId(Integer.parseInt(rs.getNString("id_user")));
				u.setNome(rs.getNString("nome"));
				u.setNomeUser(rs.getNString("nm_user"));
				u.setPassUser(rs.getNString("pass_user"));
				u.setUrlAvatar(rs.getNString("url_avatar"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return u;
	}

}

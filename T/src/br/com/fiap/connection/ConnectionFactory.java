package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection DBConnectionManager() throws ClassNotFoundException, SQLException {
		String dbURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		String user = "rm85619";
		String pwd = "010101";
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(dbURL, user, pwd);
	}
	
}

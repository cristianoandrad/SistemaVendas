package com.sistemaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static Connection conn = null;
	
	private Conexao() {	}
	
	public static Connection getConexao() {
		if (conn == null) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sistemavenda", "root", "12345678");				
			} catch (SQLException | ClassNotFoundException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			return conn;			
		}		
		return conn;
	}	
}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dao {
String user = "root";
String psw = "admin";
String ruta = "jdbc:mysql://localhost:3306/losinsanitos";

//METODO PARA AGREGAR--EN PROCESO
public void agregar() {
	Connection conexion  = null;
	Statement stmt = null;
	String sql = "INSERT INTO `losnoinsanos`(`idLosNoInsanos`,`DNI`)VALUES(3,12345678);";
	
	try {
		conexion = conectar();
		stmt = conexion.createStatement();
		int filas =stmt.executeUpdate(sql);
		System.out.println(filas);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			conexion.close();
		}catch(SQLException e) {
            e.printStackTrace();
		}
	}
}
//METODO PARA CONECTAR LISTO
public Connection conectar() {
	Connection conexion  = null;
	try {
		conexion = DriverManager.getConnection(ruta, user, psw);
		System.out.println("conecto");
	}catch(SQLException e){
		e.printStackTrace();
	} 
	return conexion;
	}

//METODO PARA ELIMINAR LISTO
public void eliminar() {
	Connection conexion = null;
	Statement stmt = null;
	String sql ="DELETE FROM `losinsanitos`.`losnoinsanos`WHERE DNI =94695694;";
	try {
		conexion = conectar();
		stmt = conexion.createStatement();
		int filas =stmt.executeUpdate(sql);
		System.out.println(filas);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			conexion.close();
		}catch(SQLException e) {
            e.printStackTrace();
		}
	}
}
public void actualizar() {
	Connection conexion = null;
	
}
}

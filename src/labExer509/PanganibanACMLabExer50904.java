package labExer509;

import java.sql.*;

public class PanganibanACMLabExer50904 {
	public static void main(String [] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindb509", "root","root");
		Statement sta = con.createStatement();

		int c = sta.executeUpdate("DELETE from alvin where accnum<6667");

		System.out.println("Record Deleted");
		sta.close();
		con.close();
		}
		catch (Exception e) {
		System.err.println("Exception: "+e.getMessage());
		}
	} 
}


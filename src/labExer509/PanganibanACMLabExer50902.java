package labExer509;

import java.sql.*;

public class PanganibanACMLabExer50902 {
	public static void main(String [] args) {
		 Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindb509", "root","root");
			Statement sta = con.createStatement();
			// insert 3 rows
			int count = 0;
			int c = sta.executeUpdate("INSERT INTO alvin"
			+ " (accnum, fname, sname)"
			+ " VALUES (4444, 'Melo', 'Abante')");
			count = count + c;
			c = sta.executeUpdate("INSERT INTO alvin"
			+ " (accnum, fname, sname)"
			+ " VALUES (6666, 'Herbert', 'Semana')");
			count = count + c;
			c = sta.executeUpdate("INSERT INTO alvin"
			+ " (accnum, fname, sname)"
			+ " VALUES (5555, 'Melvin', 'Nipas')");
			count = count + c;
	
			System.out.println("Number of rows inserted: "+count);
			sta.close();
			con.close();
		}
		catch (Exception e) {
			System.err.println("Exception: "+e.getMessage());
		}
	}
}


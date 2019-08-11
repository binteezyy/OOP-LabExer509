package labExer509;

import java.sql.*;

public class PanganibanACMLabExer50901 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bindb509";
		String query = "select * from alvin";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()){
				System.out.println("Account No: " + rs.getString(1));
				System.out.println("Surname: " + rs.getString(2));
				System.out.println("First Name: " + rs.getString(3));
			}
		}
		catch(SQLException ex){
			while (ex!=null){
				System.out.println ("SQL Exception: " + ex.getMessage ());
				ex = ex.getNextException();
			}
		}
		catch(java.lang.Exception ex){
			ex.printStackTrace();	
		}
	}
} 


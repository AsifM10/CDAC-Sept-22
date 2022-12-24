package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false","root","asif2239");
			Statement s=con.createStatement();
			ResultSet rs =s.executeQuery("select count(*)as totalnumber from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			s.close();
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			System.out.println("done");

	}

}

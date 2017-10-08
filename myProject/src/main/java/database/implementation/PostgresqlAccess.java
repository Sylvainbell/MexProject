package database.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.interfaces.PostgresqlAccessItf;
import services.objects.Product;

public class PostgresqlAccess implements PostgresqlAccessItf{

	private Connection conn = null;

	public void PostgresqlAccess() {
		String dbURL = "jdbc:mysql://localhost:5432/postgres";
		String username = "postgres";
		String password = "postgresql";

		try {

			this.conn = DriverManager.getConnection(dbURL, username, password);

			if (this.conn != null) {
				System.out.println("Connected");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void PostgresqlAccess(String dbURL, String username, String password ) {

		try {

			this.conn = DriverManager.getConnection(dbURL, username, password);

			if (this.conn != null) {
				System.out.println("Connected");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}


	@Override
	public void create(String cmd, Product myBO) {
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

		PreparedStatement statement;
		try {
			statement = this.conn.prepareStatement(sql);

			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
			statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			statement.close();
			this.conn.commit();
			this.conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void read() {

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}

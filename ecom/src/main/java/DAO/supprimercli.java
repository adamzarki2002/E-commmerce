package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class supprimercli {
	public void supprimercli(int numcli) {
		Connection connection= Connexion.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("delete  from client where  numCli=? ; ");
			ps.setInt(1, numcli);
			ps.executeUpdate();
			ps.close();
			System.out.println(11);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}

	}

}

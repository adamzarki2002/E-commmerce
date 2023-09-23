package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metier.Clients;

public class Login {
	static Connection conn =Connexion.getConnection();
	
	
	
	public boolean saveUser(Login user){
        boolean set = false;
        Connection conn=Connexion.getConnection();
    	PreparedStatement pt;
        try {
        	pt= conn.prepareStatement("insert into client(email,pass) values(?,?)");
           
           
           pt.setString(1, Clients.getEmail());
           pt.setString(2, Clients.getPass());
           pt.executeUpdate();
           
           set = true;
           System.out.println("vous etes connecté ");
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
	public static Clients getUser(String email , String pass) {
		System.out.println(1);
		Clients user =new Clients();
		System.out.println(2);
		try {
			PreparedStatement pt=conn.prepareStatement("Select * from client where email=? and pass=?");
			System.out.println(3);
			pt.setString(1, email);
			pt.setString(2, pass);
		    
			ResultSet rs =pt.executeQuery();
			System.out.println(4);
			if(rs.next()) {
				user.setNumCli(rs.getInt("numcli"));
				user.setPass(rs.getString("pass"));
				user.setNomCli(rs.getString("nomcli"));
				user.setPrenomCli(rs.getString("prenomcli"));
				user.setEmail(rs.getString("email"));
				user.setNumtel(rs.getString("numtel"));
				System.out.println(user);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return user;

	}
	
	
	
	
	
    static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean validate(Clients user) throws ClassNotFoundException, SQLException
	{
		boolean status = false;
		
		
		String sql = "select * from client where email = ? and pass =? ";
		PreparedStatement ps;
		try 
		{
		ps = conn.prepareStatement(sql);
	    ps.setString(1, user.getEmail());
		ps.setString(2, user.getPass());
		
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}



}

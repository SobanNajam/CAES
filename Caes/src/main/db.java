package main;
import java.sql.*;
import javax.swing.JOptionPane;
public class db {

    
public Connection connection;

public void displaySQLErrors(SQLException e)
			{
			System.out.println("SQLException: " + e.getMessage());
			System.out.println(e.getMessage());
			}
public void connectToDB(String dbname)
    {
    try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname+"?user=root&password=soban");
            }
	catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Cannot connect to server!", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }
public void insert(String querry) {
    try {
        Statement statement1 = connection.createStatement();
	statement1.executeUpdate(querry);
        System.out.println("\nsuccessfull in insering or updating to db\n");
        statement1.close();
        }
    catch(SQLException e)
        {
        displaySQLErrors(e);
        System.out.println("\nunsuccessfull in inserting to db\n");
	}
}

public void deletefuction(String querry)
{
	try{
		Statement s = connection.createStatement();
		s.executeUpdate(querry);
            }
	catch(SQLException e)
            {displaySQLErrors(e);}


}
public void DisconnectFromDB()
    {
     try{
        connection.close();
        }
     catch(SQLException e)
        {displaySQLErrors(e);}
    }

}


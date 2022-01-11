import java.sql.*;

public class ConnexionBD {


	  static final String url = "jdbc:mysql://localhost:3306/immo_location";
	  static final String user = "root";
	  static final String pwd = "";
	  
	  Connection connection;

	  public ConnexionBD(){
	    connexion();
	  }

	  public void connexion(){
	    try{
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      connection = DriverManager.getConnection(url, user, pwd);
	      System.out.println("connexion a la BD!");
	    }catch(SQLException|ClassNotFoundException e){
	      System.out.println("Erreur de connexion a la BD!");
	      System.out.println(e.toString());
	    }
	  }

	  public ResultSet select(String query){
	    try{
	      Statement statement = connection.createStatement();
	      ResultSet result = statement.executeQuery(query);
	      return result;
	    }catch(SQLException e){
	      System.out.println("ERROR while executing select query!");
	      System.out.println(e.toString());
	      return null;
	    }
	  }

	  public int update(String query){
	    try{
	      Statement statement = connection.createStatement();
	      return statement.executeUpdate(query);
	    }catch(SQLException e){
	      System.out.println("ERROR while executing update query");
	      System.out.println(e.toString());
	      return -1;
	    }
	  }

	  public int delete(String query){
	    try{
	      Statement statement = connection.createStatement();
	      return statement.executeUpdate(query);
	    }catch(SQLException e){
	      System.out.println("ERROR while deleting line!");
	      System.out.println(e.toString());
	      return -1;
	    }
	  }

	  public void close(){
	    try{
	      connection.close();
	    }catch(SQLException e){
	      System.out.println("ERROR while closing connections!");
	      System.out.println(e.toString());
	    }
	  }
	  
	  public static void arret(String message) {
	      System.err.println(message);
	      System.exit(99);
	   }
	  
	  public void afficheResultat(ResultSet resultat) {
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++)
		               System.out.print(resultat.getString(i) + " ");
		            System.out.println();
		            encore = resultat.next();
		         }

		         resultat.close();
		      } catch (SQLException e) {
		         arret(e.getMessage());
		      }
	  }


}

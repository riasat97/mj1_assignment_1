package output;
import java.sql.*;  

public class ConnectDb{  
public static void main(String args[]){  
    
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");  
    System.out.println("Connected");
    Statement statement=con.createStatement();  
    ResultSet rs=statement.executeQuery("select * from users");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+" "+rs.getString(2));  
    con.close();  
    
    }catch(Exception e){ System.out.println(e);}  
}  
}  
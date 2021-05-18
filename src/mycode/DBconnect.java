
package mycode;

import com.mysql.jdbc.Connection;
import static java.lang.System.console;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author aweer
 */
public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/time_table_m","root","");
//            System.out.println("OK");
        
        }catch(Exception e){
            
            System.out.println(e);
        
        }
        
        return conn;
    
    }
    
}

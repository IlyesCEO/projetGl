/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tpglproj;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class TPGLPROJ {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
/*
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","Stophacking22_");
Statement st= (Statement) con.createStatement();
    String username = "jackHrlow";
    String email = "jackhrlw666@gmail.com";
    String password ="hahaGOTIII";
    String ROLE = "agent de vente";
     String insert = "INSERT INTRO users VALUES("+username+","+email+","+password+","+ROLE+");";
     ResultSet res = st.executeQuery("SELECT *FROM test1;");
     while(res.next()){
            //if(res.getString("email").compareTo("ilyesmaro5@gmail.com")==0){System.out.println(res.getString("email"));}
           System.out.println(res.getString(1)); 
     }
     con.close();
    
*/
Testphp conx=new Testphp();
     Connection conn =conx.connecting();
        System.out.println("connection secceeded");
        String query = "SELECT * FROM products;";
      PreparedStatement st= (PreparedStatement) conn.prepareStatement(query);
               ResultSet res= st.executeQuery();
               if(res.next()){
                   System.out.println("whhat?");
               }else{
                   System.out.println("nice");
               }
        conn.close();
        
       
    }
}

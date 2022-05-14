/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpglproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Testphp {
  public Connection conn;
  
  public Connection connecting() throws SQLException{
      
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/glproject?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           
           return conn;
  }
}

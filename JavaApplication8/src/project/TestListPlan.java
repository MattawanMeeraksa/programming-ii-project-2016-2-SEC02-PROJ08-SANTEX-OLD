/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestListPlan {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        MySQLConnect connection = new MySQLConnect();
        Scanner sc = new Scanner(System.in);
        ListPlan lp = new ListPlan();
        lp.create("Sit-up", "Up and down.",30);
        lp.create("Push up", "Go Go", 25);
        
    }  
}
        
    
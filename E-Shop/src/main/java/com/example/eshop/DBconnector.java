package com.example.eshop;
import java.sql.*;

public class DBconnector {
    private final String url = "jdbc:mysql//localhost:3306/ecom";
    private final String db = "ecom";
    private final String username = "root";
    private final String password = "Shubham@007";

    private Statement getStatement(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/"+ db + "?user=" + username + "&password=" + password);
            return connection.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getQueryTable(String query){
        try{
            Statement statement = getStatement();
            return statement.executeQuery(query);
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public int execute(String query){
        try{
            Statement statement = getStatement();
            return statement.executeUpdate(query);
        } catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        DBconnector conn = new DBconnector();
        ResultSet res = conn.getQueryTable("show tables");
        if(res != null)
            System.out.println(res);
        else System.out.println("Connection failed");
    }
}

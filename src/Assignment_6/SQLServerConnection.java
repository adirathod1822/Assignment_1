package Assignment_6;

import java.sql.*;
    public class SQLServerConnection {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://SRKSUR5195LT; trustServerCertificate=true;databaseName = airport_db";
            String user = "sa";
            String password = "01082002";
            try {
                Connection connection = DriverManager.getConnection(url, user,password);
                Statement stmt = connection.createStatement();
                String s = "Select * from dbo.citymast";
                ResultSet rs = stmt.executeQuery(s);
                if(rs.next()){
                    System.out.println(rs.getString(2));
                }

                System.out.println("Connected!!");
            }
            catch(SQLException e) {
                System.out.println("error!!");
                e.printStackTrace();
            }
        }
    }


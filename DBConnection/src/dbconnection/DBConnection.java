
package dbconnection;

import java.sql.*;
public class DBConnection {
    private static final String Driver = "Con.mysql/.jdbc.driver";
    private static final String URL = "jdbc:mysql://localhost:";
    private static final String PORT = "3306/";
    private static final String DB = "students";//from Question 01
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static void main(String[] arrgs) {
        Connection con = null;
        Statement st = null;
        try{
        con = DriverManager.getConnection(URL+PORT+DB,USER,PASS);
        String sql = "Select*from results";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next());{
            int id = rs.getInt(1);
            String name = rs.getString(2);
            float mark = rs.getFloat(3);
            System.out.println("ID is: "+id);
            System.out.println("Name is: "+name);
            System.out.println("Mark is: "+mark);
            System.out.println(markSystem(mark));
        }
        rs.close();
    }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String markSystem(int mark){
        String result = null;
        if(100>=mark&&mark>=80){
            result = "Grade is: A+ \n"; 
        }
        else if (79>=mark&&mark>=75){
            result = "Grade is: A \n";
        }
        else if (mark>=74&&mark>=70){
            result = "Grade is: A- \n";
        }
        else if (mark>=69&&mark>=65){
            result = "Grade is: B+ \n";
        }
        else if (mark>64&&mark>=60){
            result = "Grade is: B";
        }
        else if(mark>=59&&mark>=55){
            result = "Grade is: B- \n";
        }
        else if (mark>=54&&mark>=50){
            result = "Grade is: C+ \n";          
        }
        else if (mark>=49&&mark>=45){
            result = "Grade is: C \n";            
        }
        else if (mark>=44&&mark>=40){
            result = "Grade is: D \n";                   
        }
        else
        {
            result = "Grade is: F(Better luck next Time) \n";
        }
        
        
    }
    
}

package com.student.manage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;



public class StudentDao {
	
	public static boolean insertStudentToDB(Student st)
    {
        boolean f=false;
        try{

            Connection con = CP.createC();
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            pstmt.executeUpdate();
            f=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

	public static boolean deleteStudent(int userId) {
		 boolean f=false;
	        try{

	            Connection con = CP.createC();
	            String q="delete from students where sid=?";
	            PreparedStatement pstmt = con.prepareStatement(q);
	            pstmt.setInt(1, userId);
	           
	            pstmt.executeUpdate();
	            f=true;
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return f;
		
	}

	
    
	
	public static boolean showAllData() {
        boolean f=false;
        try{

            Connection con = CP.createC();
            String q="select * from students;";
            Statement stmt = con.createStatement();
            

            ResultSet set=stmt.executeQuery(q);
            while(set.next())
            {
                int id=set.getInt(1);
                
                String name=set.getString(2);
                
                String phone=set.getString(3);
                
                String city=set.getString("scity");

                System.out.println("ID : "+ id);
                System.out.println("Name : "+ name);
                System.out.println("Phone : "+ phone);
                System.out.println("ID : "+ city);
                System.out.println("===============================");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }


	public static boolean updateStudent(int userId)
	{
    boolean f=false;
    try{

        Connection con = CP.createC();
        String q="insert into students(sname,sphone,scity) values(?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(q);
        pstmt.setString(1, st.getStudentName());
        pstmt.setString(2, st.getStudentPhone());
        pstmt.setString(3, st.getStudentCity());

        pstmt.executeUpdate();
        f=true;
    }catch(Exception e){
        e.printStackTrace();
    }
    return f;
}
}
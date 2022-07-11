package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}

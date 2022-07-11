import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;


public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1)
			{
				
				System.out.println("Enter user name :");
				String name=br.readLine();

				System.out.println("Enter user phone :");
				String phone=br.readLine();

				System.out.println("Enter user city :");
				String city=br.readLine();
				//create student obj to store
				Student st=new Student(name,phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is added successfully...");
				}else
				{
					System.out.println("Something went wrong try again");
				}
				
				System.out.println(st);
				
			}else if(c==2) {
				
			}else if(c==3) {
				
			}else if(c==4)
			{

				break;
			}else
			{

			}
			
			
		}
		System.out.println("Thank you for using my application....");
		System.out.println("See ya");

	}

}

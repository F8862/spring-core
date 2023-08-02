package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        /*Student student=new Student(313,"Furquan Ansari","Balapur");
        int r = studentDao.insert(student);
        System.out.println("Done"+r);*/
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// we use BufferedReader class to get input from user
        boolean go=true;
        while(go){
        System.out.println("Press 1 for add new Student");
        System.out.println("Press 2 for display All students");
        System.out.println("Press 3 for display single Student");
        System.out.println("Press 4 for delete Student");
        System.out.println("Press 5 for update Student");
        System.out.println("Press 6 for exit");
        
        
        try{
        	int input = Integer.parseInt(br.readLine());
        	
        	switch (input) {
			case 1:
				//add new student
				System.out.println("Enter StudentId:");
				int studentId=Integer.parseInt(br.readLine());
				System.out.println("Enter StudentName:");
				String studentName=br.readLine();
				System.out.println("Enter StudentId:");
				String studentCity=br.readLine();
				
				Student student=new Student();
				student.setStudentId(studentId);
				student.setStudentName(studentName);
				student.setStudentCity(studentCity);
				int r = studentDao.insert(student);
				System.out.println(r+"student added....");
				System.out.println("=========================");
				
				break;
				
			case 2:
				//get All students
				List<Student> students = studentDao.getAllStudents();
				for(Student st:students){
					System.out.println("ID:"+st.getStudentId());
					System.out.println("Name:"+st.getStudentName());
					System.out.println("City:"+st.getStudentCity());
					System.out.println("---------------------------");
				}
				System.out.println("==================================");
				
				break;
			case 3:
				//get single student
				System.out.println("Enter StudentId:");
				int sId = Integer.parseInt(br.readLine());
				Student student2 = studentDao.getStudent(sId);
				System.out.println("ID:"+student2.getStudentId());
				System.out.println("Name:"+student2.getStudentName());
				System.out.println("City:"+student2.getStudentCity());
				System.out.println("==================================");

				break;
			case 4:
				//delete student
				System.out.println("Enter StudentId:");
				int stId = Integer.parseInt(br.readLine());
				 studentDao.deleteStudent(stId);
				 System.out.println("Student deleted!!!");
				 System.out.println("==================================");
				
				break;
			case 5:
				//update student
				System.out.println("Enter StudentId:");
				int studenId=Integer.parseInt(br.readLine());
				System.out.println("Enter StudentName:");
				String studenName=br.readLine();
				System.out.println("Enter StudentCity2:");
				String studenCity=br.readLine();
				Student student3=new Student();
				student3.setStudentId(studenId);
				student3.setStudentName(studenName);
				student3.setStudentCity(studenCity);
				studentDao.updateStudent(student3);
				System.out.println("Student Details update!!!");
				System.out.println("==================================");
				
				break;
			case 6:
				//exit
				
				go=false;
				break;

			}
        	
        	
        }catch(Exception e) {
        	System.out.println("Invalis input try with another one!!!");
        	System.out.println(e.getMessage());
        	
        }
        
    }
        System.out.println("Thankyou for using!!!");
}
}

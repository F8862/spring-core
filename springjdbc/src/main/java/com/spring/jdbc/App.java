package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My prrogram started!" );
        /*//we use this when we use xml file for configuration
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");*/
        
      //we use this when we use java file for configuration. for this we no need to use xml file
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        
        
        /*JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        //fire query
        int result = template.update(query,456,"Asim","Balapur");
        System.out.println("No.of record inserted.."+ result);*/
        
        StudentDAO studentDAO = context.getBean("studentDAO",StudentDAO.class);
       /* //insert
        Student student=new Student();
        student.setId(666);
        student.setName("Umair");
        student.setCity("Akola");
        int result = studentDAO.insert(student);
        System.out.println("No.of record inserted.."+ result);*/
        
        /*//update
        Student student=new Student();
        student.setId(666);
        student.setName("Uzair");
        student.setCity("Khamgaon");
        int result = studentDAO.change(student);
        System.out.println("data changed"+result);*/
        
        //delete by giving hard coded value
      //int result = studentDAO.delete(666);
        //System.out.println("deleted"+result);
        
     /* //delete by giving value from user
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student id:");
        int id=Integer.parseInt(s.nextLine());
        int result = studentDAO.delete(id);
        System.out.println("deleted"+result);*/
        
        /*//select single data
        Student student = studentDAO.getStudent(222);
        System.out.println(student);*/
        
        //select single data
        List<Student> students = studentDAO.getAllStudents();
        for(Student s:students){
        	System.out.println(s);
        }
        
        
        
    }
}

package cg.demo.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.SpringAssignment.beans.Employee;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp = (Employee) context.getBean("emp");

        emp.display();
        System.out.println("\nSBU Details:");
        emp.getSBUDetails();
    }
}
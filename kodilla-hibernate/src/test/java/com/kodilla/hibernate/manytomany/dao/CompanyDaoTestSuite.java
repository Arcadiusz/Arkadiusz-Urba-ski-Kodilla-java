package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");


        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testCompanyAndEmployeeNamedQueries() {
        //Given
        Employee JohnS = new Employee("John", "Smith");
        Employee MaryS = new Employee("Mary", "Smith");
        Employee MiaK = new Employee("Mia", "Kovalsky");
        Employee KateS = new Employee("Kate", "Smith");

        Company MicroWeb = new Company("MicroWeb Systems");
        Company LightGraphics = new Company("Light Graphics Inc");
        Company NewSolutions = new Company("New Solutions");

        MicroWeb.getEmployees().add(JohnS);
        MicroWeb.getEmployees().add(MaryS);
        LightGraphics.getEmployees().add(KateS);
        LightGraphics.getEmployees().add(JohnS);
        NewSolutions.getEmployees().add(JohnS);
        NewSolutions.getEmployees().add(MaryS);
        NewSolutions.getEmployees().add(MiaK);

        JohnS.getCompanies().add(MicroWeb);
        JohnS.getCompanies().add(LightGraphics);
        JohnS.getCompanies().add(NewSolutions);
        MaryS.getCompanies().add(MicroWeb);
        MaryS.getCompanies().add(NewSolutions);
        MiaK.getCompanies().add(NewSolutions);
        KateS.getCompanies().add(LightGraphics);

        companyDao.save(MicroWeb);
        int microId = MicroWeb.getId();
        companyDao.save(LightGraphics);
        int lightId = MicroWeb.getId();
        companyDao.save(NewSolutions);
        int newId = MicroWeb.getId();
        System.out.println("===========================================================================");
        System.out.println("===========================================================================");
        System.out.println(employeeDao.findAll());
        System.out.println("===========================================================================");
        System.out.println("===========================================================================");

        //When
        List<Company> resultCompanyNames = companyDao.retrieveWithThreeLetters("Mic");
        List<Employee> resultEmployeesLastNames = employeeDao.retrieveEmployeesWithLastname("Smith");

        //Then
        Assert.assertEquals(1, resultCompanyNames.size());
        Assert.assertEquals(3, resultEmployeesLastNames.size());

        //CleanUp
        try {
            companyDao.delete(microId);
            companyDao.delete(lightId);
            companyDao.delete(newId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
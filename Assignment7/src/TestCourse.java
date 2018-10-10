/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Course {
    private String CourseName;
    private String[] Students;
    private int NumberOfStudents;
    
    public void Course (String CourseName){
        this.CourseName=CourseName;
    }
    public String getCourseName(){
        return CourseName;
    }
    public void AddStudent(String Students){
        
    }
    public void DropStudents(String Students){
        
    }
    public String[] GetStudents(){
        return Students;
    }
    public int GetNumberOfStudents(){
        return 0;
    }
    
}

public class TestCourse{
public static void main (String [] args){
    Course Nadim = new Course();
    Nadim.AddStudent("Name");
    Nadim.GetNumberOfStudents();
}    
}

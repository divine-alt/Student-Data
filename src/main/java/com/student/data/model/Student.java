package com.student.data.model;
//
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    private String studentId;
    private String studentName;
    private String rollNo;
    private String yearOfAdmission;

    public Student(){

    }

    public Student(String studentId, String studentName, String rollNo, String yearOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(String yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }
}

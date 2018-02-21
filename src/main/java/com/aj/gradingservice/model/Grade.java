package com.aj.gradingservice.model;

public class Grade {

    private int id;
    private String studentId;
    private String grade;

    public Grade(int id, String studentId, String grade) {
        this.id = id;
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

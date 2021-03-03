package student;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: student
 * Project Name: StudentManagementSystem
 * Date: 14-02-2021
 */

public final class Student {
    private String name;
    private int universityRollNumber;
    private String fatherName;
    private String motherName;
    private int phoneNumber;
    private String address;

    public Student(String name, int universityRollNumber, String fatherName, String motherName, int phoneNumber, String address) {
        this.name = name;
        this.universityRollNumber = universityRollNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Student(String name, int universityRollNumber) {
        this.name = name;
        this.universityRollNumber = universityRollNumber;
    }

    public Student(String name, String fatherName) {
        this.name = name;
        this.fatherName = fatherName;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(int universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name of student: " + getName() +
                "University Roll Number: " + getUniversityRollNumber() +
                "Father's Name: " + getFatherName() +
                "Mother's Name: " + getMotherName() +
                "Phone Number: " + getPhoneNumber() +
                "Address: " + getAddress();
    }
}

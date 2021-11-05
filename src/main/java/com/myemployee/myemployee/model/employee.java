package com.myemployee.myemployee.model;


import javax.persistence.*;

@Entity
public class employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column
    private String empname;
    @Column
    private int empid;
    @Column
    private String Dept;
    @Column
    private String company;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

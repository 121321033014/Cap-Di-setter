package org.rohiniinfotech.Employee;

public class Project {
    public int projectid;
    public String projectname;
    public String projectCode;
    public String projectmanager;

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectmanager() {
        return projectmanager;
    }

    public void setProjectmanager(String projectmanager) {
        this.projectmanager = projectmanager;
    }
    public void display(){
        System.out.println("the project details are with Id:"+projectid+"and name of the project:"+projectname+"and the description is :"+projectCode+"and the project manager is"+projectmanager);
    }
}

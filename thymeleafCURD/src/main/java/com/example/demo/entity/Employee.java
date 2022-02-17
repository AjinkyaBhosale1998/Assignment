package com.example.demo.entity;

import java.util.Objects;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long eId;
private String empName,empCompany;
public Long geteId() {
return eId;
}
public void seteId(Long eId) {
this.eId = eId;
}
public String getEmpName() {
return empName;
}
public void setEmpName(String empName) {
this.empName = empName;
}
public String getEmpCompany() {
return empCompany;
}
public void setEmpCompany(String empCompany) {
this.empCompany = empCompany;
}
@Override
public int hashCode() {
return Objects.hash(eId, empCompany, empName);
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Employee other = (Employee) obj;
return Objects.equals(eId, other.eId) && Objects.equals(empCompany, other.empCompany)
&& Objects.equals(empName, other.empName);
}
@Override
public String toString() {
return "Employee [eId=" + eId + ", empName=" + empName + ", empCompany=" + empCompany + "]";
}
public Employee(Long eId, String empName, String empCompany) {
super();
this.eId = eId;
this.empName = empName;
this.empCompany = empCompany;
}

public Employee() {
super();
}
}
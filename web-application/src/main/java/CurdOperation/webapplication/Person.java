package CurdOperation.webapplication;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Person implements Serializable{
 
    /**
     * 
     */
    private static final long serialVersionUID = -1031411737883443065L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String name, address, phone;
	
    
    @Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
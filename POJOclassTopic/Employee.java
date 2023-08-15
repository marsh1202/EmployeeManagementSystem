package POJOclassTopic;

public class Employee {
private int id;
private String Name;
private String email;
private String designation;
private long Phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public long getPhone() {
	return Phone;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", email=" + email + ", designation=" + designation + ", Phone="
			+ Phone + "]";
}
public void setPhone(long phone) {
	Phone = phone;
}
	
}

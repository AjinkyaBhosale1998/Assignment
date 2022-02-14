import java.util.Objects;


public class Publisher

{
private long pid;
private String name, location;
public void publisherCreate()
{
System.out.println("publisher object is created");
}
public void publisherDeleting()
{
System.out.println("publisher object is deleted");
}
public long getPid() {
return pid;
}
public void setPid(long pid) {
this.pid = pid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getLocation() {
return location;
}
public void setLocation(String location) {
this.location = location;
}
@Override
public int hashCode() {
return Objects.hash(location, name, pid);
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Publisher other = (Publisher) obj;
return Objects.equals(location, other.location) && Objects.equals(name, other.name) && pid == other.pid;
}
@Override
public String toString() {
return "Publisher [pid=" + pid + ", name=" + name + ", location=" + location + "]";
}



}
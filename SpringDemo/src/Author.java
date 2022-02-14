import java.util.Objects;public class Author
{
private Integer authorID;
private String name,country;
private Book book_author;
public Integer getAuthorID() {
return authorID;
}
public void setAuthorID(Integer authorID) {
this.authorID = authorID;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCountry() {
return country;
}
public void setCountry(String country) {
this.country = country;
}
public Book getBook_author() {
return book_author;
}
public void setBook_author(Book book_author) {
this.book_author = book_author;
}
@Override
public int hashCode() {
return Objects.hash(authorID, book_author, country, name);
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Author other = (Author) obj;
return Objects.equals(authorID, other.authorID) && Objects.equals(book_author, other.book_author)
&& Objects.equals(country, other.country) && Objects.equals(name, other.name);
}
@Override
public String toString() {
return "Author [authorID=" + authorID + ", name=" + name + ", country=" + country + ", book_author="
+ book_author + "]";
}
}


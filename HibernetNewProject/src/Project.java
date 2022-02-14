import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.Entity;

@Entity

public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectID;
    private String projectName;
    
    @Version
    private Integer vesion;
    
    @Embedded
    private Address address;
    
}

package proz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	public Student getXML() {
		Student student = instanteStudent();
		student.setMime(MediaType.APPLICATION_XML.toString());
		return student;
	}

	@GET
	@Produces({ MediaType.TEXT_XML })
	public Student getHTML() {
		
		return null;
	}

	private Student instanteStudent() {
		Student student = new Student();
		student.setFirstName("Kamil");
		student.setLastName("Bibus");
		student.setIndexNo(1);
		return student;
	}
}
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
	@Produces({ MediaType.TEXT_HTML })
	public String getHTML() {
		Student student = instanteStudent();
		student.setMime(MediaType.TEXT_HTML.toString());
		String textHtml = "<br><h2 style=\"color:grey;\">" + student.getFirstName() + "<br>" + student.getLastName() + "<br>"
				+ student.getIndexNo().toString() + "</h2>";
		return textHtml;
	}

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	public String getTxt() {
		Student student = instanteStudent();
		student.setMime(MediaType.TEXT_PLAIN.toString());
		String textPlain = student.getFirstName() + " " + student.getLastName() + " " + student.getIndexNo().toString();
		return textPlain;
	}

	private Student instanteStudent() {
		Student student = new Student();
		student.setFirstName("Kamil");
		student.setLastName("Bidus");
		student.setIndexNo(12345);
		return student;
	}
}
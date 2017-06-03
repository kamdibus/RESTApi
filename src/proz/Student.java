package proz;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String firstName;
	private String lastName;
	private Integer indexNo;
	private String mime;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(Integer indexNo) {
		this.indexNo = indexNo;
	}

	public void setMime(String string) {
		switch (string) {
		case "APPLICATION_XML":
			this.mime = "application/xml";
			break;

		default:
			break;
		}
	}

}

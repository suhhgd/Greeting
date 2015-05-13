package sg.edu.nus.iss.club.oscar;

public class Facility {
	private String name;
	private String description;
	
	public Facility(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Facility(String name) {
		this(name, "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void show(){
		String fullName = this.name;
		if (this.description != ""){
			fullName += "(" + this.description + ")";
		}
		System.out.println(fullName);;
	}
}

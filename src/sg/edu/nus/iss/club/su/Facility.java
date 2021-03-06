package sg.edu.nus.iss.club.su;

public class Facility {
	
	private String name;
	private String description;
		
	public Facility(String name)
	{
		this.name=name;
	}
	public Facility(String name,String desc)
	{
		this.name=name;
		this.description=desc;
	}
	public void show()
	{
		System.out.println(toString());
		
	}
	public String toString()
	{
		String print=this.getName();
		
		if(this.getDescription()!=null)
		{
			print+="("+this.getDescription()+")";
		}
		return print;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}

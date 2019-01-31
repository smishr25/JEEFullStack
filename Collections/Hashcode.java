
import java.util.HashSet;

public class Hashcode {
	
	public String name;
	public Hashcode(String name)
	{
		this.name=name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Employ name: "+ name;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Hash code value: "+name.hashCode());
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println();
		Hashcode emp=(Hashcode)obj;
		if(name.equals(emp.getName()))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		HashSet<Hashcode> hs=new HashSet<>();
		hs.add(new Hashcode("Sushil"));
		hs.add(new Hashcode("Sushil"));
		System.out.println(hs.toString());

	}
	

}
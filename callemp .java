import java.util.ArrayList;

public class callemp 
{
	public void acc()
	{
		ArrayList<Employeedetail>e=new ArrayList<>();
		e.add(new Employeedetail(1,"Tania",30000,"B" ));
		e.add(new Employeedetail(2,"Mona",15000,"c") );
		e.add(new Employeedetail(3,"Seema",40000,"B" ));
		for(Employeedetail obj:e)
		{
			System.out.println(obj.empid);
			System.out.println(obj.empname);
			System.out.println(obj.salary);
			System.out.println(obj.grade);
		}
		
	}
	public static void main(String args[])
	{
		callemp oo=new callemp();
		oo.acc();
	}

}
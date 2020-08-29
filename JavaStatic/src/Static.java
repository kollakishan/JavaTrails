class Hi
{
	int id;
	int age;
	String name;
	static String ceo;
	
	public void show()
	{
		System.out.println(id +"  :  " +age+ "  :  "+ name +"  :  "+ ceo);
	}
	
}


public class Static {
	public static void main(String[] args)
	{
		Hi kishan = new Hi();
		kishan.id = 3;
		kishan.age = 23;
		kishan.name = "kishan";
		Hi.ceo = "yp";
	
		
		Hi indra = new Hi();
		indra.id = 4;
		indra.age = 20;
		indra.name = "indra";
		indra.ceo = "sdb";
		
		
		kishan.show();
		indra.show();
		 
		
	}

}

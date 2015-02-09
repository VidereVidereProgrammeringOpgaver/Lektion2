import java.util.ArrayList;

public class Data implements IData

{

	private class Person {

		String cpr;

		String navn;

		double hoejde;

		double vaegt;

		public Person(String cpr, String navn, double hoejde, double vaegt) {

			super();

			this.cpr = cpr;

			this.navn = navn;

			this.hoejde = hoejde;

			this.vaegt = vaegt;

		}

	}

	private ArrayList<Person> personer; 

	public Data(){

		personer = new ArrayList<Person>();

		// Tilf¿j personer

		personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));

		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));

		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));


	}

	//Returner personens navn

	public String getNavn(String cpr) throws DataException{
		int i = 0;
		while(true){
			try {
				if (personer.get(i).cpr.equals(cpr)){
					return personer.get(i).navn;
				}
			}catch(IndexOutOfBoundsException e){
				//System.err.println("Caight array out of bounds exception: "+ e.getMessage());
				throw new DataException("Fandt ikke et cpr nr der passsede");
				
			}
			i++;

		}
		

	}

	//Returner personens v¾gt

	public double getVaegt(String cpr) throws DataException{
		int i = 0;
		while(true){
			try {
				if(personer.get(i).cpr.equals(cpr)){
					return personer.get(i).vaegt;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et cpr nr der passede.");
			}
			i++;
		}

	}


	//Returner personens h¿jde

	public double getHoejde(String cpr) throws DataException{
		int i = 0;
		while(true){
			try {
				if(personer.get(i).cpr.equals(cpr)){
					return personer.get(i).hoejde;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et cpr der passede");
			
			}
			i++;
		}

	}
}
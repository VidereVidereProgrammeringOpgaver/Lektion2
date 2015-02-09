import java.util.Scanner;
public class TestFunktionalitet {

	/**
	 * Test the thingy program
	 * @throws DataException 
	 */
	public static void main(String[] args) {
		IFunktionalitet e = new Funktionalitet();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Klar til at modtage kommando!");
		System.out.println("Kommandoer: hent navn, hent bmi");
		while(scanner.hasNext()){
			String dataInput = scanner.nextLine();
			if(dataInput.contains("bmi")){
				System.out.println("Skriv et CPR for at får BMI");
				try {
					System.out.println(e.getBMI(scanner.nextLine()));
				} catch (IData.DataException e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(dataInput.contains("navn")){
				System.out.println("Skriv et CPR for at får navn");
				try {
					System.out.println(e.getNavn(scanner.nextLine()));
				} catch (IData.DataException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
			}
		}
		scanner.close();





	}

}

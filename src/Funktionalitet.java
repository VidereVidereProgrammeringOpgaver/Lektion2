
public class Funktionalitet implements IFunktionalitet {

	IData e = new Data();

	@Override
	public double getBMI(String cpr) throws IData.DataException  {

		return e.getVaegt(cpr)/(e.getHoejde(cpr)*e.getHoejde(cpr));
	}

	@Override
	public String getTextualBMI(String cpr) throws IData.DataException {
		if(getBMI(cpr) < 18.5){
			System.out.println(" Du Vejer for lidt, Din BMI er" + getBMI(cpr));	
		}else if(getBMI(cpr) >= 18.5 && getBMI(cpr) < 25){
			System.out.println("Din v¾gt er passende, Din BMI er" + getBMI(cpr));	
		}else if(getBMI(cpr) >= 25 && getBMI(cpr) < 30  ){
			System.out.println(" Du er overv¾gtig, Din BMI er" + getBMI(cpr));

		}else if(getBMI(cpr) > 30){
			System.out.println(" Du er sv¾rt overv¾gtig, Din BMI er" + getBMI(cpr));
		}
		return String.valueOf(getBMI(cpr));
	}

	@Override
	public String getNavn(String cpr) throws IData.DataException {

		return e.getNavn(cpr);
	}

}

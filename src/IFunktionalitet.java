
public interface IFunktionalitet {

	// beregn BMI udfra personens CPR-nr

	double getBMI(String cpr) throws IData.DataException;

	// return�r en tekst der beskriver BMI intervallet 

	String getTextualBMI(String cpr) throws IData.DataException; 

	// return�r perosn navn udfra CPR-nr

	String getNavn(String cpr) throws IData.DataException; 

}

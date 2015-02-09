
public interface IData {

	//Gets the weight of the person with a given cpr nr.
	double getVaegt(String cpr) throws DataException;
	//Gets the height of the person with a given cpr nr.
	double getHoejde(String cpr) throws DataException;
	//Gets the name of the person with a given cpr nr.
	String getNavn(String cpr) throws DataException;

	public class DataException extends Exception{
		String ErrorMessage = "ABC";
		public DataException(String string1) {
			super(string1);
		}
	}
}

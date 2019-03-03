package classes;

public class DateFieldEvaluetion implements FieldEvaluetion{


	String date;
	
	@Override
	public Boolean IsValid(String field) {
		
		if(ValidarData.isValid(field))
			return true;
		else
			System.out.println("data invalida");
		
		return false;
	}
}

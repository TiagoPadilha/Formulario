package classes;

public class FieldEvaluetor{
	
	String name;
	String date;
	String number;

	public void Evaluete(String name, String date, String number) {
		
		NameFieldEvaluetion nameIsValid = new NameFieldEvaluetion();
		DateFieldEvaluetion dateIsValid = new DateFieldEvaluetion();
		NumberFieldEvaluetion numberIsValid = new NumberFieldEvaluetion();
		
		if(nameIsValid.IsValid(name) && dateIsValid.IsValid(date) && numberIsValid.IsValid(number))
			System.out.println("formulario valido");
			
	}
}

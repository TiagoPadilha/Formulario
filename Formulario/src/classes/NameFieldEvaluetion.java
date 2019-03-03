package classes;

public class NameFieldEvaluetion implements FieldEvaluetion{

	@Override
	public Boolean IsValid(String name) {
		
		if(name.length()== 0)
			return false;
		
		return true;
		
	}

}

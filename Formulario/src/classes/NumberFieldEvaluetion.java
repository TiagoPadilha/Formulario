package classes;

public class NumberFieldEvaluetion implements FieldEvaluetion {

	@Override
	public Boolean IsValid(String field) {
		if(field.length()!=11 && field.length()!=14) {
			System.out.println("quantidade de numeros invalida");
				return false;
		}
		
		if(field.length()==11) {
			if(ValidarCpf.isCPF(field)) {
				return true;
			}
			System.out.println("cpf invalido");
		}
		
		if(field.length()==14) {
			if(ValidarCnpj.isCNPJ(field)) {
				return true;
			}
			System.out.println("cnpj invalido");
		}
			
		return false;
	}

}

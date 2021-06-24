
public class TesteSistema {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		referencia.setSenha(0101);
		
		Gerente gerente = new Gerente();
		gerente.setSenha(0101);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(0101);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(0101);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(administrador);
		si.autentica(cliente);
		si.autentica(referencia);
	}
}


public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Joana Aparecida");
		gerente1.setCpf("152.589.456-15");
		gerente1.setProfissao("Gerente de Designer UX");
		gerente1.setSalario(5000.0);
		
		Funcionario gerente2 = new Gerente();
		gerente2.setNome("Mateus Oliveira");
		gerente2.setCpf("256.555.877-96");
		gerente2.setProfissao("Gerente de Marketing");
		gerente2.setSalario(2000.00);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Pedro Roberto");
		editorVideo.setCpf("122.555.888-18");
		editorVideo.setProfissao("Editor de Vídeo II");
		editorVideo.setSalario(2200.00);
		
		Designer designer = new Designer();
		designer.setNome("Moura Silva");
		designer.setCpf("165.589.699-15");
		designer.setProfissao("Designer Gráfico");
		designer.setSalario(1500.00);
		
		System.out.println("\n---------- BONIFICAÇÕES ENTRE FUNCIONÁRIOS - REFERÊNCIAS -----------\n");
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(gerente1);
		controle.registra(gerente2);
		controle.registra(editorVideo);
		controle.registra(designer);
		
		System.out.println("\nSoma total das bonificações: R$ " + controle.getSoma());
	}
}

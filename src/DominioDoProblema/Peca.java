package DominioDoProblema;

public class Peca {
	//selecionada nao tem no diagrama
	protected boolean selecionada;
	protected String cor;
	protected boolean _foiCapturada;
	public Posicao _unnamed_Posicao_;

	public String getCor() {
		return this.cor;
	}
	
	//esse m�todo nao veio com a modelagem
	public void setCor(String cor){
		this.cor=cor;
	}
	
	//m�todo nao tem no diagrama
	public void setSelecionda(boolean selecionada) {
		this.selecionada = selecionada; 	
	}
	//m�todo nao tem no diagrama
	public boolean getSelecionda() {
		return this.selecionada; 	
	}
}

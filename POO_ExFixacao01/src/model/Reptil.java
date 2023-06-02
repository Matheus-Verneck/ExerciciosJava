package model;

public class Reptil extends Animal implements IAnimal {

	private boolean capacidadeRegenerativa;

	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Traquial");
	}
	
	//construtor simples
	public Reptil() {
		super();
	}//fim do construtor simples

	//construtor completo
	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor, 
			String reproducao, String alimentacao, boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}//fim do construtor completo 

	//getters e setters
	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}//fim dos getters e setters 

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Pecilotérmico");		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- EXIBIR RÉPTIL ---" + "\nNomenclatura: " + super.getNomenclatura()
		+ "\nNúmero de patas: " + super.getNumeroDePatas() + "\nCoberto por: " + super.getCobertoPor()
		+ "\nReprodução: " + super.getReproducao() + "\nAlimentação: " + super.getAlimentacao()
		+ "\nHabitat: " + this.capacidadeRegenerativa);
		tipoDeRespiracao();
		temperaturaCorporal();
	}

}

package model;

public class Mamifero extends Animal implements IAnimal {

	private String habitat;

	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Pulmonar");
	}
	
	//construtor simples
	public Mamifero() {
		super();
	}//fim do construtor simples 

	//constutor completo
	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao,String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}//fim do construtor completo

	//getters e setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}//fim dos getters e setters

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Homeotérmico");		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- EXIBIR MAMÍFERO ---" + "\nNomenclatura: " + super.getNomenclatura()
		+ "\nNúmero de patas: " + super.getNumeroDePatas() + "\nCoberto por: " + super.getCobertoPor()
		+ "\nReprodução: " + super.getReproducao() + "\nAlimentação: " + super.getAlimentacao()
		+ "\nHabitat: " + this.habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
	}
	
}

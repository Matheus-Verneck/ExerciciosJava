package model;

public class Carro {

	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;

	//método frear
	public String frear(int valor) {
		if (!this.motorLigado) { //se não tiver ligado
			return this.modelo + " ATENÇÃO: O motor está desligado: O carro já está parado!\n";
		} else { //daqui tá ligado/verificando se a velocidade é 0
			if (this.velocidade == 0) {
				return this.modelo + " ATENÇÃO: O carro já está parado!\n";
			} else { //ligado e em movimento
				if (this.velocidade - valor <= 0) {
					//freia e fica negativo. forçar velocidade zero
					this.velocidade = 0;
					return this.modelo + " FREOU! O carro está parado!\n";
				} else { //freia mas não chega a zero. continua andando
					this.velocidade -= valor;
					return this.modelo + " FREOU! Velocidade atual " + this.velocidade + "km/h\n";
				}//fim do terceiro if...else
			}//fim do segundo if...else
		}//fim do primeiro if...else		
	}//fim do frear
	
	//método acelerar
	public String acelerar(int valor) {
		if (this.motorLigado) {
			this.velocidade += valor;
			return this.modelo + " ACELEROU! Velocidade atual: " + this.velocidade + " km/h\n";
		} else {
			return this.modelo + " ATENÇÂO: Não é possível acelerar com o motor desligado\n";
		}//fim do if...else
	}//fim do acelerar
	
	// método desligarMotor
	public String desligarMotor() {
		if (!this.motorLigado) { //se não tiver ligado
			return "O motor do " + this.modelo + " já estava desligado!\n";
		} else { 
			//daqui tá ligado/verificando se ta em movimento
			if (this.velocidade > 0) {
				return "ATENÇÃO: O motor do " + this.modelo 
						+ " não foi desligado pois o carro está em movimnto\n";
			} else {
				//aqui ta ligado e parado/fazendo desligar
				this.motorLigado = false;
				return "O motor do " + this.modelo + " foi desligado agora!\n";
			}//fim do segundo if...else
		}//fim do primeiro if...else 
	}// fim do desligarMotor

	// método ligarMotor
	public String ligarMotor() {
		if (this.motorLigado) {
			return "O motor do " + this.modelo + " já estava ligado!\n";
		} else {
			this.motorLigado = true; // ligando o motor
			return "O motor do " + this.modelo + " foi ligado agora!\n";
		} // fim do if...else
	}// fim do ligarMotor

	// método situacaoMotor
	public String situacaoMotor() {
		if (this.motorLigado) { // == false ou ! (para testar se for falso)
			return this.modelo + "--> Motor ligado!\n";
		} else {
			return this.modelo + "--> Motor desligado!\n";
		} // fim do iff...else
	}// fim do situacaoMotor

	// método detalhes
	public void detalhes() {
		System.out.println("\n---Detalhes do carro--- " + "\nFabricante: " + this.fabricante + "\nModelo: "
				+ this.modelo + "\nAno: " + this.ano + "\n");
	}// fim do detalhes

	// construtor simples
	public Carro() {
		super();
	}// fim do construtor simples

	// construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}// fim do construtor completo

	// terceiro método construtor personalizado
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}// fim do construtor personalizado

	// métodos getters e setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}// fim dos getters e setters

}// fim da classe
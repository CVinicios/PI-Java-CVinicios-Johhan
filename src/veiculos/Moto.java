package veiculos;

import enum_Automovel.Capacidade_tanque;
import enum_Automovel.Cilindrada;
import enum_Automovel.Cor;
import enum_Automovel.Marca;
import enum_Automovel.Modelo;
import enum_Automovel.Tipo;

public class Moto extends Automovel
{
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", cpTanque=" + cpTanque
				+ ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", cor=" + cor + ", chassi=" + chassi + ", preco=" + preco
				+ "]";
	}

	Cilindrada cilindrada;
	Capacidade_tanque cpTanque; 
	
	public Moto(String chassi, float preco, Marca montadora, Modelo modelo,Cilindrada cilindrada2, Capacidade_tanque cpTanque2, Tipo tipo,Cor cor)
	{
		this.chassi = chassi;
		this.preco = preco;
		this.marca = montadora;
		this.modelo = modelo;
		this.cilindrada = cilindrada2;
		this.cpTanque = cpTanque2;
		this.tipo = tipo;
		this.cor = cor;
		
		
	}

	public Cilindrada getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Cilindrada cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Capacidade_tanque getCpTanque() {
		return cpTanque;
	}

	public void setCpTanque(Capacidade_tanque cpTanque) {
		this.cpTanque = cpTanque;
	}
	
}

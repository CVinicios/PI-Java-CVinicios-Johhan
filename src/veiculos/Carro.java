package veiculos;

import enum_Automovel.Cambio;
import enum_Automovel.Cor;
import enum_Automovel.Marca;
import enum_Automovel.Modelo;
import enum_Automovel.Motorizacao;
import enum_Automovel.Tipo;

public class Carro extends Automovel
{
	
	
	Motorizacao motorizacao; 
	Cambio cambio; 
	@Override
	public String toString() {
		return "Carro [motorização=" + motorizacao + ", cambio=" + cambio
				+ ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", cor=" + cor + ", chassi=" + chassi + ", preco=" + preco
				+ "]";
	}
	public Carro(String chassi, float preco, Marca montadora, Modelo modelo,Motorizacao motorizacao, Cambio cambio2, Tipo tipo, Cor cor)
	{
		this.chassi = chassi;
		this.preco = preco;
		this.marca = montadora;
		this.modelo = modelo;
		this.motorizacao = motorizacao;
		this.cambio = cambio2;
		this.tipo = tipo;
		this.cor = cor;
		
	}
	public Motorizacao getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(Motorizacao motorizacao) {
		this.motorizacao = motorizacao;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
}

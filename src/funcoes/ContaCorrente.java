package funcoes;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	private String numero;
	private double saldo;
	private double limiteCreditoEspecial;
	private Agencia agencia;
	
	public boolean  efetuarSaque(double valorSaque){
		if(saldo>valorSaque){
			saldo -= valorSaque;
			return true;
		}else if(limiteCreditoEspecial>0 && (limiteCreditoEspecial+saldo)>=valorSaque){
			int confirmacao = JOptionPane.showConfirmDialog(null,
			    "Saldo Insuficiente, Deseja sacar do Credito Especial?");
			if(confirmacao==0){
				saldo -= valorSaque;
				return true;
			}
			return false;
		}
		return false;
	}
	
	public void efetuarDeposito(double valorDeposito){
		if(valorDeposito>0){
			saldo += valorDeposito;
		}else{
			JOptionPane.showMessageDialog(null, 
					"Informe um valor válido!");
		}
	}
	
	public void liberarCreditoEspecial(double valor){
		if(valor>0){
			if(valor<limiteCreditoEspecial){
				int confirmacao = JOptionPane.showConfirmDialog(null,
					    "Você possui limite superior ao informado,"
					    + " Deseja continuar? \n \n Limite atual:"
					    + " R$" + limiteCreditoEspecial);
				if(confirmacao==0){
					limiteCreditoEspecial = valor;
				}
			}else{
				limiteCreditoEspecial = valor;
			}
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLimiteCreditoEspecial() {
		return limiteCreditoEspecial;
	}
	public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
		this.limiteCreditoEspecial = limiteCreditoEspecial;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getResumo(){
		String resumo = "Conta Corrente: " + numero 
			+ "\n Saldo: R$ " + saldo
			+ "\n Crédito Especial: " 
			+ ((limiteCreditoEspecial>0)?
			 "Sim - R$" + limiteCreditoEspecial:"Não");
		return resumo;
	}
	
}

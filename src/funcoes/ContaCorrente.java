package funcoes;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	//Declara��o dos atributos
	private String numero;
	private double saldo;
	private double limiteCreditoEspecial;
	private Agencia agencia;
	private Titular titular;
	
	//mostra informa��es da classe titular
	public Titular getTitular() {
		return titular;
	}
	//Pega dados da classe titular
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	//Processa o pedido de saque permetindo com credito especial caso o valor da conta seja menor que o do saque, e retorna verdadeiro ou falso 
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
	
	//Recebe o valor de deposito se o valor for v�lido retorna a autoriza��o para deposito.
	public void efetuarDeposito(double valorDeposito){
		if(valorDeposito>0){
			saldo += valorDeposito;
		}else{
			JOptionPane.showMessageDialog(null, 
					"Informe um valor v�lido!");
		}
	}
	
	//Respons�vel por liberar o credito especial.
	public void liberarCreditoEspecial(double valor){
		if(valor>0){
			if(valor<limiteCreditoEspecial){
				int confirmacao = JOptionPane.showConfirmDialog(null,
					    "Voc� possui limite superior ao informado,"
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
	//Mostra o conte�do 
	public String getNumero() {
		return numero;
	}
	//Pega dados
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//Mostra o conte�do 
	public double getLimiteCreditoEspecial() {
		return limiteCreditoEspecial;
	}
	
	//Pega dados
	public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
		this.limiteCreditoEspecial = limiteCreditoEspecial;
	}
	
	//Mostra o conte�do 
	public Agencia getAgencia() {
		return agencia;
	}
	
	//Pega dados
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	//Mostra o conte�do 
	public double getSaldo() {
		return saldo;
	}
	
	//Mostra o conte�do 
	public String getResumo(){
		String resumo = "Conta Corrente: " + numero 
			+ "\n Saldo: R$ " + saldo
			+ "\n Cr�dito Especial: " 
			+ ((limiteCreditoEspecial>0)?
			 "Sim - R$" + limiteCreditoEspecial:"N�o");
		return resumo;
	}
	
}
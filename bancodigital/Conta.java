package com.bancodigital;

import lombok.AllArgsConstructor;  
import lombok.Getter;  
import lombok.NoArgsConstructor;  
import lombok.Setter;  
import lombok.ToString;  
import lombok.Data;
@Data
@NoArgsConstructor  
@AllArgsConstructor  
@ToString 
public abstract class Conta implements IConta {
	 private static final int AGENCIA_PADRAO = 1;
	    private  static int SEQUENCIAL = 1;
	    //protected serve para a classes filhas poderem enxergar
	    protected int agencia;
	    protected int numero;
	    protected double saldo;
	    protected Cliente cliente;
	    protected Banco banco;
	    protected String NomeDoBanco;
	    
	    
	  

	    public Conta (Cliente cliente ){
	        this.agencia = Conta.AGENCIA_PADRAO;
	        this.numero = SEQUENCIAL++;
	        this.cliente = cliente;
	        
	       
	    }
	    public Conta(Banco banco) {
	    	this.banco =banco;
	    }
	    
	    

	    @Override
	    public void sacar(double valor) {
	        saldo = saldo - valor;

	    }

	    @Override
	    public void depositar(double valor) {
	        saldo = saldo + valor;

	    }

	    @Override
	    public void transferir(double valor, Conta contaDestino) {
	        this.sacar(valor);
	        contaDestino.depositar(valor);

	    }
	    protected void imprimirInfosComuns() {

	        System.out.println(String.format("Cliente: %s" ,this.cliente.getNomeCliente()));
	        System.out.println(String.format("Agencia: %d" ,this.agencia));
	        System.out.println(String.format("Numero: %d" , this.numero));
	        System.out.println(String.format("Saldo: %.2f" , this.saldo));
	        System.out.println(String.format("Banco:" + " Itaú "  ));
	    }

}

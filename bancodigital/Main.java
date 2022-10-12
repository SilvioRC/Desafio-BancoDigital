package com.bancodigital;

public class Main {
	 public static void main(String [] args) {
		 
	  
	  
      Cliente nomeCliente01 = new Cliente();
      nomeCliente01.setNomeCliente(" Silvio ");

      Cliente nomeCliente02 = new Cliente();
      nomeCliente02.setNomeCliente(" Silvio ");
      
      Conta cc = new ContaCorrente(nomeCliente02);
      cc.depositar(40000);
      cc.depositar(20000);
      
      

      Conta cp = new ContaPoupanca(nomeCliente01);
      cc.transferir(30000 , cp);
      cc.transferir(6000,cp);
      

      cc.imprimirExtrato();
      
      cp.imprimirExtrato();

}
}

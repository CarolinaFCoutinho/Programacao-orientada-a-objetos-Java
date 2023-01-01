//Carolina de Faria Coutinho PT3009718

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Conta> contas = new ArrayList<Conta>();//Criando lista de contas
    Banco caixa = new Banco(1111, "João", contas);
    Corrente cc = new Corrente();//Conta corrente
    cc.setId(2);
		cc.setNumero("2222");
		cc.setSaldo(1000);
		cc.setLimite(100);
		cc.realizaDeposito(200);
		cc.realizaSaque(1250);
    caixa.cadastrarConta(cc);//Cadastrando conta corrente no banco
    
		Poupanca cp = new Poupanca();//Conta Poupança
		cp.setId(3);
		cp.setNumero("3333");
		cp.setSaldo(2000);
		cp.setTaxaJuro(0.06F);
		cp.realizaDeposito(500);
		cp.realizaSaque(2400);
    caixa.cadastrarConta(cp);//Cadastrando conta poupança no banco

    //Exibindo nome, numero do banco do João.
    System.out.println("Nome: " + caixa.getName());
    System.out.println("Numero: " + caixa.getNum() + "\n");
    caixa.exibirContas();//ToString da conta corrente e poupança

    caixa.removerConta(cc);//removendo a conta corrente
    System.out.println("\n");
    caixa.exibirContas();//exibindo todas as contas
  }
}
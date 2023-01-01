import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta{
  private int num;
  private String name;
  private List<Conta> contas;

  public Banco(int no, String n, List<Conta> c){
    this.num = no;
    this.name = n;
    this.contas = c;
  }
  public int getNum(){
    return num;
  }

  public void setNum(int num){
    this.num = num;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void cadastrarConta(Conta c) {
    contas.add(c);
	}
  
  
  public void removerConta(Conta c) {
		contas.remove(c);
	}

  public void exibirContas(){
      for(int i = 0; i < contas.size(); i++ ){
        System.out.println(contas.get(i).toString() + "\n");
    }
  }

}
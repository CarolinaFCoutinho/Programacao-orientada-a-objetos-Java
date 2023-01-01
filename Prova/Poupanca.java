public class Poupanca extends Conta {
	private float taxaJuro;
	
	@Override
	public void realizaSaque(float valor) {
		if(valor > super.getSaldo()) {
			System.out.println("Não foi possível efetuar o saque!");
		}else {
			super.realizaSaque(valor);
		}
	}

  @Override
  public String toString() {
	return super.toString() + "\nTaxa de Juros: " + this.taxaJuro;
  }

	public float getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(float taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
			
}
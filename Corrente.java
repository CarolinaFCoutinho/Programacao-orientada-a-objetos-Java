public class Corrente extends Conta {
  private float limite;
		
	@Override
	public float consultaSaldo() {
		return super.consultaSaldo() + this.limite;
	}

  @Override
  public String toString() {
	return super.toString() + "\nLimite: " + this.limite;
  }
  
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
}
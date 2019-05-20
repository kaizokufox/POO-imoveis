
public class Comercial extends Imovel {
	protected float percAdd;
	
	public float showPreco () {
		return this.preco+this.preco*this.percAdd;
	}

}

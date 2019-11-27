package factory.method;

//instancia o objeto
public class FabricaDeConsumo implements FabricaDeGastos {

	@Override
	public Gastos criarGasto(String gasto) {

		if (gasto.equals("cerveja")) {

			return new Cerveja();

		} else

			return new Agua();

	}

}

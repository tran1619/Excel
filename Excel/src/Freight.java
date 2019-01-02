
public class Freight {
	private int freight;
	private	int pallet;

	public Freight(int freight, int pallet) {
		this.freight = freight;
		this.pallet = pallet;
	}
	
	public int getCaseCost(Item item) {
		return freight / pallet / item.getCasePerPallet();
	}
}

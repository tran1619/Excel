package inventory.lib;

public class Item {
	private String name;
	private int casePerPallet;
	private int freightPerCase;
	private int beginQuantity;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCasePerPallet() {
		return casePerPallet;
	}
	public void setCasePerPallet(int casePerPallet) {
		this.casePerPallet = casePerPallet;
	}
	public int getFreightPerCase() {
		return freightPerCase;
	}
	public void setFreightPerCase(int freightPerCase) {
		this.freightPerCase = freightPerCase;
	}
	public int getBeginQuantity() {
		return beginQuantity;
	}
	public void setBeginQuantity(int beginQuantity) {
		this.beginQuantity = beginQuantity;
	}

}

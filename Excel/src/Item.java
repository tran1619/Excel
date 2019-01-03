


public class Item {
	private String name;
	private int beginQuantity;
	private int endQuantity;
	private int currentQuantity;
	private int casePerPallet;
	private boolean active;
	
	public Item(String name, int beginQuantity) {
		this.name = name;
		this.beginQuantity = beginQuantity;
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
	
	public int getBeginQuantity() {
		return beginQuantity;
	}
	public void setBeginQuantity(int beginQuantity) {
		this.beginQuantity = beginQuantity;
	}

	public int getEndQuantity() {
		return endQuantity;
	}

	public void setEndQuantity(int endQuantity) {
		this.endQuantity = endQuantity;
	}

	public int getCurrentQuantity() {
		return currentQuantity;
	}

	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}

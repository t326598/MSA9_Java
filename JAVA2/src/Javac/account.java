package Javac;

public class account {

	private int deposit;
	private String depositor;
	private String depoNumber;
	private String bank;
	public int se = 1000;
	//기본 생성자
	public account() {
	}
	
	public account(int deposit, String depositor, String depoNumber, String bank, int se) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.depoNumber = depoNumber;
		this.bank = bank;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getSe() {
		return se;
	}

	public void setSe(int se) {
		this.se = se;
	}

	@Override
	public String toString() {
		return "accout [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", bank="
				+ bank + ", se=" + se + "]";
	}
	

	
	
}

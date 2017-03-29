package by.library.domain;

public class Phone {
	private int id;
	private String firstName;
	private String secondName;
	private String lastName;
	private String address;
	private long numCreditCard;
	private double debet;
	private double credit;
	private double timeTownCall;
	private double timeInterTownCall;
	
	@Override
	public String toString() {
		return "Phone [id=" + id + ", firstName=" + firstName + ", secondName="
				+ secondName + ", lastName=" + lastName + ", address="
				+ address + ", numCreditCard=" + numCreditCard + ", debet="
				+ debet + ", credit=" + credit + ", timeTownCall="
				+ timeTownCall + ", timeInterTownCall=" + timeInterTownCall
				+ "]";
	}

	public Phone(){
		
	}
	
	public Phone(int id, String firstName, String secondName, String lastName,
			String address, long numCreditCard, double debet, double credit,
			double timeTownCall, double timeInterTownCall) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.numCreditCard = numCreditCard;
		this.debet = debet;
		this.credit = credit;
		this.timeTownCall = timeTownCall;
		this.timeInterTownCall = timeInterTownCall;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumCreditCard() {
		return numCreditCard;
	}

	public void setNumCreditCard(int numCreditCard) {
		this.numCreditCard = numCreditCard;
	}

	public double getDebet() {
		return debet;
	}

	public void setDebet(int debet) {
		this.debet = debet;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getTimeTownCall() {
		return timeTownCall;
	}

	public void setTimeTownCall(int timeTownCall) {
		this.timeTownCall = timeTownCall;
	}

	public double getTimeInterTownCall() {
		return timeInterTownCall;
	}

	public void setTimeInterTownCall(int timeInterTownCall) {
		this.timeInterTownCall = timeInterTownCall;
	}
	
	
	
}


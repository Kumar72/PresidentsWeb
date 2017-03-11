package data;

public class President {
	private String firstName, middleName, lastName, party, fact;
	private int termNumber, startYear, endYear;
	
	
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", party=");
		builder.append(party);
		builder.append(", fact=");
		builder.append(fact);
		builder.append(", termNumber=");
		builder.append(termNumber);
		builder.append(", startYear=");
		builder.append(startYear);
		builder.append(", endYear=");
		builder.append(endYear);
		builder.append("]");
		return builder.toString();
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
	public int getTermNumber() {
		return termNumber;
	}
	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	
	
	
	
}

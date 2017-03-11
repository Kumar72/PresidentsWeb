package data;

import java.util.ArrayList;
import java.util.List;

public class PresDAOImpl implements PresDAO {

	public PresDAOImpl() {
		
	}
	
	public List<President> PresArray =	new ArrayList<>();
	public List<President> PresPhotoArray =	new ArrayList<>();
	public List<President> PresFactArray =	new ArrayList<>();
	
	
	@Override
	public void loadPresidentsFromFile() {
		// TODO Auto-generated method stub
		
	}
	public President getPresidentsFromFile(int presNum) {
		return PresArray.get(presNum-1);
	}

	
	
	
	@Override
	public void displaySelectedPresident() {
		// TODO Auto-generated method stub
		
	}
	public President getPresidentPhoto(int presNum) {
		return PresPhotoArray.get(presNum-1);
	}

	
	
	
	@Override
	public void loadInterestingFact() {
		// TODO Auto-generated method stub
		
	}
	public President getInterestingFact(int PresNum) {
		return PresFactArray.get(PresNum-1);
	}
	

	

}

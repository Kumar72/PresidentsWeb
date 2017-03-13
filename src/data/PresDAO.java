package data;

import java.util.*;

public interface PresDAO {
	
	public List<President> loadPresidentsFromFile();
	public List<President>getPicturePath();
	public List<President>getPresByParty(String party);
		
}

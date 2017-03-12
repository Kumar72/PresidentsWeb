package data;

import java.util.*;

public interface PresDAO {
	
	public List<President> loadPresidentsFromFile();
	public List<President> getPresidentFactFromFile();
	public Map<Integer, President> getHashMapFromArrayList();
	public President getPresidentByTerm(Integer term);
	public List<President>getPicturePath();
		
}

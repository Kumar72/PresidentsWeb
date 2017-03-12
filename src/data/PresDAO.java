package data;

import java.util.*;

public interface PresDAO {
	
	public List<President> loadPresidentsFromFile() throws Exception;
	public List<President> getPresidentFactFromFile() throws Exception;
	public Map<Integer, President> getHashMapFromArrayList()throws Exception;
	public President getPresidentByTerm(Integer term)throws Exception;
	public List<String>getPicturePath() throws Exception;
		
}

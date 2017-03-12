package data;

import java.util.*;

public interface PresDAO {
	
	public List<Presidents> loadPresidentsFromFile() throws Exception;
	public List<Presidents> getPresidentFactFromFile() throws Exception;
	public Map<Integer, Presidents> getHashMapFromArrayList()throws Exception;
	public Presidents getPresidentByTerm(Integer term)throws Exception;

		
}

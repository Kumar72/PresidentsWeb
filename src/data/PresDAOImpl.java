package data;

import java.io.*;
import java.util.*;


public class PresDAOImpl implements PresDAO {
	private File files = new File("presidents.csv");
	private File fact = new File("PresidentFact.txt");
	private List<Presidents> presArray = new ArrayList<>();
	private HashMap<Integer, Presidents> president = new HashMap<Integer, Presidents>();

	@Override
	public List<Presidents> loadPresidentsFromFile() throws Exception {
		BufferedReader pres = new BufferedReader(new FileReader(files));
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split(",");
			int term = Integer.parseInt(input[0]);
			String firstName = input[1];
			String middleName = input[2];
			String lastName = input[3];
			String termYears = input[4];
			String politicalParty = input[5];
			presArray.add(new Presidents(term, firstName, middleName, lastName, termYears, politicalParty));
		}
		pres.close();
		return presArray;
	}

	@Override
	public List<Presidents> getPresidentFactFromFile() throws Exception {
		List<Presidents> presArray = loadPresidentsFromFile();
		List<String> facts = new ArrayList<>();
		BufferedReader pres = new BufferedReader(new FileReader(fact));
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split("\\r");
			facts.add(input[0]);
		}
		for (int i = 0; i < presArray.size() & i < facts.size(); i++) {
			presArray.get(i).setFact(facts.get(i));
		}
		pres.close();
		return presArray;
	}
	@Override
	public HashMap<Integer, Presidents> getHashMapFromArrayList() throws Exception{
		List<Presidents> presArray = getPresidentFactFromFile();
		for (Presidents presidents : presArray) {
			president.put(presidents.getTerm(), presidents);
		}
		return president;
	}
	
	@Override
	public Presidents getPresidentByTerm(Integer term) throws Exception {
		Map<Integer, Presidents> presTerm = getHashMapFromArrayList();
	
		return presTerm.get(term);
	}

	@Override
	public String toString() {
		return "PresDAOImpl [files=" + files + ", fact=" + fact + ", president=" + president + "]";
	}

}

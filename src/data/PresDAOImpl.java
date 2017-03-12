package data;

import java.io.*;
import java.util.*;


public class PresDAOImpl implements PresDAO {
	private File files = new File("presidents.csv");
	private File fact = new File("PresidentFact.txt");
	private File path = new File("PicturePath.txt");
	private List<President> presArray = new ArrayList<>();
	private HashMap<Integer, President> president = new HashMap<Integer, President>();
	
	public PresDAOImpl(){};

	@Override
	public List<President> loadPresidentsFromFile() throws Exception {
		BufferedReader pres = new BufferedReader(new FileReader(files));
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split(",");
			int term = Integer.parseInt(input[0]);
			String firstName = input[1];
			String middleName = input[2];
			String lastName = input[3];
			String termYears = input[4];
			String party = input[5];
			presArray.add(new President(term, firstName, middleName, lastName, termYears, party));
		}
		pres.close();
		return presArray;
	}

	@Override
	public List<President> getPresidentFactFromFile() throws Exception {
		List<President> presArray = loadPresidentsFromFile();
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
	public HashMap<Integer, President> getHashMapFromArrayList() throws Exception{
		List<President> presArray = getPresidentFactFromFile();
		for (President presidents : presArray) {
			president.put(presidents.getTermNumber(), presidents);
		}
		return president;
	}
	
	@Override
	public President getPresidentByTerm(Integer term) throws Exception {
		Map<Integer, President> presTerm = getHashMapFromArrayList();
		return presTerm.get(term);
	}


	@Override
	public List<String> getPicturePath() throws Exception {
		List<President> presArray = loadPresidentsFromFile();
		List<String> presidents = new ArrayList<>();
		BufferedReader pres = new BufferedReader(new FileReader(path));
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split("\\r");
			presidents.add(input[0]);
		}
		for (int i = 0; i < presArray.size() & i < presidents.size(); i++) {
			presArray.get(i).setFact(presidents.get(i));
		}
		pres.close();
		return presidents;
	}

}

package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;


public class PresDAOImpl implements PresDAO {
	private InputStream files;
	private InputStream fact;
	private InputStream path;
	private List<President> presArray = new ArrayList<>();
	private HashMap<Integer, President> president = new HashMap<Integer, President>();
	private ServletContext context;
	
	public PresDAOImpl(ServletContext context){
		this.context = context;
		files = context.getResourceAsStream("presidents.csv");
		fact = context.getResourceAsStream("PresidentFact.txt");
		path = context.getResourceAsStream("PicturePath.txt");
	};

	@Override
	public List<President> loadPresidentsFromFile() {
		try (BufferedReader pres = new BufferedReader(new InputStreamReader(files))) {
		String line = "";
		while ((line = pres.readLine()) != null) {
			String[] input = line.split(",");
			int term = Integer.parseInt(input[0]);
			String firstName = input[1];
			String middleName = input[2];
			String lastName = input[3];
			String termYears = input[4];
			String party = input[5];
			presArray.add(new President(term, firstName, middleName, lastName, termYears, party));
		}} catch (IOException e) {
			System.out.println(e);
		}
		return presArray;
	}

	

	@Override
	public List<President> getPicturePath() {
		List<President> presArray = loadPresidentsFromFile();
		List<String> facts = new ArrayList<>();
		try (BufferedReader pres = new BufferedReader(new InputStreamReader(fact))){
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split("\\r");
			facts.add(input[0]);
		}
		for (int i = 0; i < presArray.size() & i < facts.size(); i++) {
			presArray.get(i).setFact(facts.get(i));
		}
		} catch (IOException e) {
			System.out.println(e);
		}
		List<String> photo = new ArrayList<>();
		try (BufferedReader pres = new BufferedReader(new InputStreamReader(path))) {
		String line;
		while ((line = pres.readLine()) != null) {
			String[] input = line.split("\\r");
			photo.add(input[0]);
		}
		for (int i = 0; i < presArray.size() & i < photo.size(); i++) {
			
			presArray.get(i).setPhoto(photo.get(i));
		}
		} catch (IOException e){
			System.out.println(e);
		}
		return presArray;
	}

}

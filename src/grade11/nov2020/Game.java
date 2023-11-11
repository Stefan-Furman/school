package grade11.nov2020;

public class Game {
	private String name;
	private String genre; 
	private boolean other;
	
	public static int countAction = 0;
	public static final String ACTION = "A";
	
	
	public Game(String name, String genre, char other) {
		setName(name);
		setGenre(genre);
		setOther(other);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		String newName = "";
		
		for (int i = 0; i < name.length(); i ++) {
			char c = name.charAt(i);
			
			if (Character.isLetterOrDigit(c) || ":- ".indexOf(c) != -1) {
				newName += c;
			}
		}
		
		int index = newName.indexOf(":");
		
		if (index != -1) {
			String before = newName.substring(0, index);
			String after = newName.substring(index + 2);
			
			newName = after + " (" + before + ")";
		}
		
		this.name = newName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		if (genre.contains(ACTION)) countAction++;
		
		this.genre = genre;
	}


	public boolean isOther() {
		return other;
	}


	public void setOther(char other) {
		if (other == 'Y') this.other = true;
		else if (other == 'N') this.other = false;
	}


	@Override
	public String toString() {
		return name + "\t" + genre + (!other? "\tWindows only":"");
	}
	
	
	
	
}

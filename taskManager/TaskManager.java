package taskManager;

import java.io.File;

public class TaskManager {

	private String name;
	private String password;
	private String hashedPassword; //implement a hashing password
	private File file;

	public TaskManager(String name, String password) {
		
		this.name = name;
		this.password = password;
		this.hashedPassword = hashPassword(password);
		this.file = new File(name + " Tasks");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String hashPassword(String password) {
		return "hashed_" + password;
	}


	public String getName(String name) {
		return name;
	}

	public boolean verifyPassword(String password) {
		return this.hashedPassword.equals(hashPassword(password));
	}

}






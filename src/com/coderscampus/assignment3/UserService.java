package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
// Buffered Reader into String Array

		public User[] createUser() {
			
			User[] users = new User[4];
			int count = 0;
			

		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while ((line = br.readLine()) != null) {

				String[] values = line.split(",");

				String username = values[0];
				String password = values[1];
				String name = values[2];
				User user = new User(username, password, name);
				users[count] = user;
				count++;

			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return users;
		
		
				}
	}


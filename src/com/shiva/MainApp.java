package com.shiva;

public class MainApp {
    static ClientRequirements requirement;
    public static void main(String[] args) {
    	requirement.welcomeuser();

		try {
			requirement.menuDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

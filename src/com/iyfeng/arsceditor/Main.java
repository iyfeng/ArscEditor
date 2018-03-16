package com.iyfeng.arsceditor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils utils = new Utils();
		utils.openArsc("/Users/feng/Documents/github/ArscEditor/resources1.arsc");
		utils.getResouces("string", "[DEFAULT]");
		utils.changeResouce("app_name", "很完但快跑");
		utils.saveArsc("/Users/feng/Documents/github/ArscEditor/resources1.arsc",
				"/Users/feng/Documents/github/ArscEditor/resources1.arsc");
	}

}

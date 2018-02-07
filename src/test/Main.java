package test;

import java.sql.ResultSet;

import ddbb.Conecction;
import ddbb.FillDB;

public class Main {

	public static void main(String[] args) {

		Conecction test = new Conecction();
		ResultSet rs=null;
		FillDB fill = new FillDB(test, rs);
		fill.truncateAll();
		fill.fillAll();
		
	}

}

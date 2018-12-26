package com.blackdownstudio.arma3_logistic_overview_tool.Reader_Writer;

import java.io.*; 

class ReaderOrder {

	public int orderNumber = 1;
	public String filename;
	
	public ReaderOrder(String filename) throws IOException {
		this.filename = filename;
		load();
	}

	public void load() throws IOException {
		filename = "order." + orderNumber + ".xml";
		FileReader fr = new FileReader("/home/moritz/workspace/arma 3 logistic overview tool (lot)/" + filename);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(filename);
		String line;
	}
}
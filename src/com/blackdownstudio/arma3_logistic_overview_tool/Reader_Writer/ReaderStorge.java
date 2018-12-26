package com.blackdownstudio.arma3_logistic_overview_tool.Reader_Writer;

import java.io.*;

class ReaderStorge {

	public String filename;
	
	public ReaderStorge(String filename) throws IOException {
		this.filename = filename;
		load();
	}

	public void load() throws IOException {
		FileReader fr = new FileReader("/home/moritz/workspace/arma 3 logistic overview tool (lot)/" + filename);
		BufferedReader br = new BufferedReader(fr);
		String line;
	}
}
package com.blackdownstudio.arma3_logistic_overview_tool;

import com.blackdownstudio.arma3_logistic_overview_tool.GUI.LOTGui;

class main {
	
	public static LOTGui guiMain;
	//public static LOTGuiOrder guiOrder;

	public static void main(String args[]) {
		
		LOTGui guiMain = new LOTGui();
		guiMain.GuiMain();
	}
}
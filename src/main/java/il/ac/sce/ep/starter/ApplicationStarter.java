package il.ac.sce.ep.starter;

import java.util.HashMap;

import il.ac.sce.ep.ui.IMainFrame;
import il.ac.sce.ep.ui.MainFrame;

public class ApplicationStarter {
	
	public static void main(String[] args) {
		//this should be replaced by Spring
		
		IMainFrame mainFrame = new MainFrame();
		ApplicationGUIMode appMode = new ApplicationGUIMode();
		appMode.setMainApplicationFrame(mainFrame);
		appMode.start(new HashMap<>());
		
	}
}

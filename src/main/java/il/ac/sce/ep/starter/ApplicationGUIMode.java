package il.ac.sce.ep.starter;

import java.util.Map;

import javax.swing.SwingUtilities;

import il.ac.sce.ep.ui.IMainFrame;
import il.ac.sce.ep.ui.data.MainFrameParameters;

public class ApplicationGUIMode implements IApplicationMode {
	
	private IMainFrame mainApplicationFrame;

	public void start(Map<String, Object> parameters) {
		MainFrameParameters mainFrameParameters = convertParamtersToFrameParams(parameters);
		SwingUtilities.invokeLater(
				() -> mainApplicationFrame.startFrame(mainFrameParameters)
		);		
	}
	
	private MainFrameParameters convertParamtersToFrameParams(Map<String, Object> parameters) {
		MainFrameParameters mainFrameParameters = new MainFrameParameters();
		return mainFrameParameters;
	}
	
	public void setMainApplicationFrame(IMainFrame mainApplicationFrame) {
		this.mainApplicationFrame = mainApplicationFrame;
	}
	
}

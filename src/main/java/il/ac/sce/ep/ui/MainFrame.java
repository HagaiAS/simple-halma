package il.ac.sce.ep.ui;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import il.ac.sce.ep.ui.data.MainFrameParameters;

public class MainFrame implements IMainFrame {

	public void startFrame(MainFrameParameters mainFrameParameters) {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Halma - Pinot");
		mainFrame.add(constructMainFramePanel());
		mainFrame.pack();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	private JPanel constructMainFramePanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.add(constructFirstComponent());
		mainPanel.add(constructFirstSecondComponent());
		return mainPanel;
	}
	
	private JComponent constructFirstComponent() {
		JButton button = new JButton();
		button.setText("First Test Button");
		return button;
	}
	
	private JComponent constructFirstSecondComponent() {
		JButton button = new JButton();
		button.setText("Second Test Button");
		return button;
	}
	
}

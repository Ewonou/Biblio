package Ensemble;
import java.awt.BorderLayout;

import javax.swing.*;

public class Biblioteca {
    String message = "Welcome";
	private JFrame frame;
	public  int numberOfMenuItems = 0; 
	JMenuItem menuOne;
	JMenuItem menuTwo;
	
	
public String getPanelMessage (){
	return message;
}



public void mainFrameBuilder(){
	frame = new JFrame ("Main");
	JPanel mainPanel = new JPanel();
	JLabel welcomeLabel = new JLabel(message);
	mainPanel.add(welcomeLabel);
	frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
	frame.setSize(200,200);
	frame.setVisible(true);	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("Menu Options");	
	fileMenu.add( menuItemCreater( menuOne, "First"));
	fileMenu.add(menuItemCreater(menuTwo,"Second"));
	menuBar.add(fileMenu);
	frame.setJMenuBar(menuBar);
}

private JMenuItem menuItemCreater(JMenuItem menuId, String menuDisplay){
	numberOfMenuItems++;
	menuId = new JMenuItem(menuDisplay);
	return menuId;
}


}

package chat.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import chat.controller.ChatController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		colorButton = new JButton("Color");
		randomButton = new JButton("random");
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}

}

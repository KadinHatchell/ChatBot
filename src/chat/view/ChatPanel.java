package chat.view;

import javax.swing.JPanel;
import javax.swing.*;
import chat.controller.ChatController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JButton chatButton;
	private JTextArea chatDisplay;
	private JTextField chatField;
	
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		chatButton = new JButton("Chat with the bot.");
		chatDisplay = new JTextArea(5, 30);
		chatField = new JTextField(25);
		baseLayout = new SpringLayout();
		
		
		
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupChatDisplay()
	{
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
		
		
	}
	private void setupLayout()
	{
		chatDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chatField.setHorizontalAlignment(SwingConstants.CENTER);
		chatField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 6, SpringLayout.SOUTH, chatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -155, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -84, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 0, SpringLayout.WEST, chatField);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, 0, SpringLayout.EAST, chatField);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, 55, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, 440, SpringLayout.WEST, this);
		
		
	}
	private void setupListeners()
	{
		String blank = "";
		
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String personWords = chatField.getText();
				String chatbotResponse = baseController.useChatbotCheckers(personWords);
				
				chatDisplay.setText("You Said: " + personWords + "\n" + "Chatbot says: " + chatbotResponse);
				chatField.setText(blank);
				
			}
	
		});
		   chatButton.addKeyListener(new KeyListener() {
			   @Override
		        public void keyTyped(KeyEvent e) {
		        }

		        @Override
		        public void keyPressed(KeyEvent e) {
		            System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
		        }

		        @Override
		        public void keyReleased(KeyEvent e) {
		        }
		    });
		
		
		
		
		
	}

}

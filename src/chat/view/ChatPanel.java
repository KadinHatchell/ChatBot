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
	/**
	 * data members needed to create the chatpanel.
	 * The chatpanel will use the controller, springlayout, a JTextField,
	 * a JButton, and a JLabel.
	 */
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JButton chatButton;
	private JTextArea chatDisplay;
	private JTextField chatField;
	
	/**
	 * chatPanel Controller, initializes data members and starts methods.
	 * @param baseController
	 */
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		chatButton = new JButton("Chat with the bot!");
		chatDisplay = new JTextArea(5, 30);
		chatDisplay.setForeground(Color.BLACK);
		chatField = new JTextField(25);
		baseLayout = new SpringLayout();
		 
		
		
		
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Sets up display in GUI, makes it non editable or enabled.
	 * 
	 */
	private void setupChatDisplay()
	{
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	/**
	 * Sets up panel, defines layout, changes background color, 
	 * adds a button text field display and label.
	 * sets the visibility to true so that we can see and use the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
		
		
	}
	/**
	 * Literally all the useless stuff
	 */
	private void setupLayout()
	{
		chatDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chatField.setHorizontalAlignment(SwingConstants.CENTER);
		chatField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -155, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -6, SpringLayout.NORTH, chatField);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, -54, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -9, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, -10, SpringLayout.EAST, this);
		
		
	}
	/**
	 * sets up all of the listeners or buttons
	 * gives the button a function and makes it so something happens when it is clicked.
	 */
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

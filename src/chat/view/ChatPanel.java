package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.util.Scanner;
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
	private JButton tweet;
	private JButton searchTweet;
	private JButton saveButton;
	private JButton loadButton;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JScrollPane chatPane;
	
	/**
	 * chatPanel Controller, initializes data members and starts methods.
	 * @param baseController
	 */
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		chatButton = new JButton("Chat with the bot!");
		chatField = new JTextField(25);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 9, SpringLayout.SOUTH, chatField);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 113, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -111, SpringLayout.EAST, this);
		tweet = new JButton("Tweet");
		baseLayout.putConstraint(SpringLayout.EAST, tweet, -10, SpringLayout.EAST, this);
		searchTweet = new JButton("Search Tweets");
		baseLayout.putConstraint(SpringLayout.WEST, tweet, 0, SpringLayout.WEST, searchTweet);
		baseLayout.putConstraint(SpringLayout.SOUTH, tweet, -6, SpringLayout.NORTH, searchTweet);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 6, SpringLayout.SOUTH, searchTweet);
		baseLayout.putConstraint(SpringLayout.WEST, searchTweet, -150, SpringLayout.EAST, chatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, searchTweet, -95, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, searchTweet, 0, SpringLayout.EAST, chatField);
		loadButton = new JButton("Load Bot");
		baseLayout.putConstraint(SpringLayout.NORTH, loadButton, 0, SpringLayout.NORTH, tweet);
		baseLayout.putConstraint(SpringLayout.WEST, loadButton, 10, SpringLayout.WEST, this);
		saveButton = new JButton("Save Bot");
		baseLayout.putConstraint(SpringLayout.EAST, loadButton, 0, SpringLayout.EAST, saveButton);
		baseLayout.putConstraint(SpringLayout.EAST, saveButton, 160, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, chatField);
		chatPane = new JScrollPane();
		 
		
		
		
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
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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
		this.add(chatPane);
		this.add(chatField);
		this.add(tweet);
		this.add(searchTweet);
		this.add(saveButton);
		this.add(loadButton);
		chatDisplay = new JTextArea(5, 30);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -94, SpringLayout.NORTH, tweet);
		
		
		add(chatDisplay);
		chatDisplay.setForeground(Color.BLACK);
		
		
	}
	/**
	 * Literally all the useless stuff
	 */
	private void setupLayout()
	{
		chatDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chatField.setHorizontalAlignment(SwingConstants.CENTER);
		chatField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, 0, SpringLayout.EAST, chatField);
		
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
				chatDisplay.setCaretPosition(0);
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

package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	
	public ChatController()
	{
		stupidBot = new Chatbot("Timmy");
		display = new ChatbotViewer();
	}
	
	public void start(){
		
		String response = "User";
		
		while(stupidBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("What do you want to talk about " + response + "?");
			
		}
		
		
		
	}
	private String useChatbotCheckers(String input)
	{
		String checkInput = "";
		
		if(stupidBot.memeChecker(input))
		{
			checkInput += "\nYou like memes!\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkInput += "\nYou know my seceret topic!\n";
		}
		if(stupidBot.politicalTopicChecker(input))
		{
			checkInput += "\nYou like politics";
		}
		
		if(checkInput.length() == 0)
		{
			checkInput = "I don't understand what you mean by " + input;
		}
		return checkInput;
	}

}

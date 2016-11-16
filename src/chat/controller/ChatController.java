package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame baseFrame;
	
	public ChatController()
	{
		stupidBot = new Chatbot("Timmy");
		display = new ChatbotViewer();
		baseFrame = new ChatFrame(this);
	}
	
	public void start(){
		
		String response = " ";
		
//		while(stupidBot.lengthChecker(response))
//		{
//			display.displayMessage(useChatbotCheckers(response));
//			response = display.collectResponse("What do you want to talk about " + response + "?");
//			
//		}
		
		
		
	}
	public String useChatbotCheckers(String input)

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
		if(stupidBot.keyboardMashChecker(input))
		{
			checkInput += "\nThat's just mumbo jumbo";
		}
//		if(stupidBot.inputHTMLChecker(input))
//		{
//			checkInput += "\nHTML";
//		}
		if(stupidBot.twitterChecker(input))
		{
			checkInput += "\nCool tweet ma dude";
		}
		if(!stupidBot.lengthChecker(checkInput))
		{
			checkInput = "I have no idea what you mean about " + input;
		}
		return checkInput;
		
		
	}

	public ChatFrame getBaseFrame()
	{
		return baseFrame;
		
	}
	
	public Chatbot getChatbot()
	{
		return stupidBot;
		
	}
}

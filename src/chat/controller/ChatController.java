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
		
		String response = "words";
		
		while(stupidBot.lengthChecker(response))
		{
			
			response = display.collectResponse("What do you want to talk about???");
		}
		
		
		
	}

}

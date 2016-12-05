package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame baseFrame;
	private String randomTopicGenerator;

	public ChatController()
	{
		stupidBot = new Chatbot("Timmy");
		display = new ChatbotViewer();
		baseFrame = new ChatFrame(this);
	}

	public void start()
	{

	}

	public String useChatbotCheckers(String input)

	{
		String checkInput = "";
		if (!stupidBot.quitChecker(input))
		{
			if (stupidBot.memeChecker(input))
			{
				checkInput += "\nYou like memes!\n";
			}
			if (stupidBot.contentChecker(input))
			{
				checkInput += "\nYou know my seceret topic!\n";
			}
			if (stupidBot.politicalTopicChecker(input))
			{
				checkInput += "\nYou like politics";
			}
			if (stupidBot.keyboardMashChecker(input))
			{
				checkInput += "\nThat's just mumbo jumbo";
			}
			if(stupidBot.inputHTMLChecker(input))
			{
			checkInput += "\nHTML";
			}
			if (stupidBot.twitterChecker(input))
			{
				checkInput += "\nCool tweet ma dude";
			}
			if (!stupidBot.lengthChecker(checkInput))
			{
				checkInput = "I have no idea what you mean";
			}
			int canBeRandom = (int) (Math.random() * 2);
			if (canBeRandom % 2 == 0)
			{
				checkInput += randomTopicGenerator();
			}

		}
		else
		{
			display.displayMessage("Thanks for chatting! Talk to you soon");
			System.exit(0);
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

	private String randomTopicGenerator()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 7);

		switch (random)
		{
		case 0:
			randomTopic = "Did you hear about the daft punk beastie boys mix?";
			break;
		case 1:
			randomTopic = "can you bring me some Sriracha?";
			break;
		case 2:
			randomTopic = "Time for some industrial!";
			break;
		case 3:
			randomTopic = "bleh bleh";
			break;
		case 4:
			randomTopic = "RandomTopic.exe";
			break;
		case 5:
			randomTopic = "IDK";
			break;
		case 6:
			randomTopic = "I make memes to hide my sadness.";
			break;
		default:
			randomTopic = "hmm";
			break;
		}
		return randomTopicGenerator;
	}
}

package chat.model;

import java.util.ArrayList;
import java.util.List;

import chat.controller.ChatController;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class CTECTwitter 
{
	private ChatController baseController;
	private Twitter chatbotTwitter;
	private List<Status> searchedTweets;
	private List<String> tweetedWords;
	
	public CTECTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		this.searchedTweets = new ArrayList<Status>();
		this.tweetedWords = new ArrayList<String>();
		this.chatbotTwitter = TwitterFactory.getSingleton();
		
	}
	
	public void sendTweet(String textToTweet)
	{
		try
		{
			chatbotTwitter.updateStatus(textToTweet + "#JavaChatbot @ChatbotCTEC");
		}
		catch(TwitterException tweetError)
		{
			baseController.handleErrors(tweetError);
		}
		catch(Exception otherError)
		{
			baseController.handleErrors(otherError);
		}
	}
	
	private String [] createIgnoredWordArray()
	{
		return null;
	}
	
	private void collectTweets(String username)
	{
		
	}
	
	public String getMostCommonWord(String user)
	{
		return null;
	}
	
	private void removeEmptyText()
	{
		
	}

}
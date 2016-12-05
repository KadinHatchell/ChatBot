package chat.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part of the project.
 * 
 * @author Kadin
 * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private ArrayList<String> keyboardMashChecker;
	private ArrayList<String> inputHTMLChecker;
	private ArrayList<String> twitterChecker;
	private ArrayList<String> quitChecker;
 	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName
	 *            The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		keyboardMashChecker = new ArrayList<String>();
		inputHTMLChecker = new ArrayList<String>();
		twitterChecker = new ArrayList<String>();
		quitChecker = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = "content";
		buildMemesList();
		buildPoliticalTopicsList();
		buildKeyboardMashChecker();
		buildInputHTMLChecker();
		buildTwitterChecker();
		buildQuitChecker();

	}

	/**
	 * Builds meme list
	 */
	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("cute animal");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("bobby hill");
		memesList.add("pupper");
		memesList.add("bite my shiny metal ass");
		memesList.add("deez nuts");
		memesList.add("got em");
		memesList.add("roses are red");
		memesList.add("pepe = terrorist");
		memesList.add("pepe");
		memesList.add("ALIENS");
		memesList.add("shrek");
		memesList.add("ken bone");
		memesList.add("jacob");
		memesList.add("leafyishere");

	}
	/**
	 * Builds politicalTopics list
	 */
	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("build a wall");
		politicalTopicList.add("lets revote");
		politicalTopicList.add("couldve done better");
		politicalTopicList.add("Donald");
		politicalTopicList.add("Gary");
		

	}
	/**
	 * Builds keyboardMash list
	 */
	private void buildKeyboardMashChecker()
	{
		keyboardMashChecker.add("S.D.F.");
		keyboardMashChecker.add("derf");
		keyboardMashChecker.add("sdf");
		keyboardMashChecker.add("dfg");
		keyboardMashChecker.add("cvb");
		keyboardMashChecker.add(",./");
		
		

	}
	/**
	 * Builds HTML list
	 */
	private void buildInputHTMLChecker()
	{
		inputHTMLChecker.add("<B>  </B>");
		inputHTMLChecker.add("<I> sdadas </i>");
		inputHTMLChecker.add("<P>");
		inputHTMLChecker.add("<A HREF=\"sdfs.html\"> </a>");
		
	}
	/**
	 * Builds twitter list
	 */
	private void buildTwitterChecker()
	{
		twitterChecker.add("#dw35 f");
		twitterChecker.add("@d4d sretsf ");
	}
	
	private void buildQuitChecker()
	{
		quitChecker.add("quit");
		
	}

	/**
	 * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true.
	 * 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;

		if (currentInput != null && !currentInput.equals(""))
		{
			hasLength = true;
		}

		return hasLength;
	}

	/**
	 * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		String test = "#Ç";
		System.out.println(test.toLowerCase());

		if (currentInput.toLowerCase().contains(content))
		{
			hasContent = true;
		}

		return hasContent;
	}

	/**
	 * Checks to see that the supplied String value is in the current memesList
	 * variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean isMeme = false;
		for (String buildmemelist : memesList)
		{
			if (currentInput.equals(buildmemelist))
			{
				isMeme = true;
			}
		}

		return isMeme;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList.
	 * Returns true if it does find a match and false if it does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean isPolitical = false;
		for (String buildPoliticalTopiclist : politicalTopicList)
		{
			if (currentInput.equals(buildPoliticalTopiclist))
			{
				isPolitical = true;
			}
		}
		return isPolitical;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the keybiardMashChecker.
	 * Returns true if it does find a match and false if it does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean isKeyboard = false;
		for (String keyboardMashChecker : keyboardMashChecker)
		{
			if (currentInput.contains(keyboardMashChecker))
			{
				isKeyboard = true;
			}
		}
		return isKeyboard;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the inputHTMLChecker.
	 * Returns true if it does find a match and false if it does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean inputHTMLChecker(String currentInput)
	{
		boolean htmlChecker = false;
		
		int open = currentInput.indexOf("<");
		int close = currentInput.indexOf(">");
		if (open == -1 || close == -1)
		{
			return htmlChecker;
		}
		String tag = currentInput.substring(open +1, close);
		int hasTag = currentInput.indexOf("<"+tag+">");
		int secondOpen = currentInput.indexOf("</");
		int secondClose = currentInput.indexOf(">", secondOpen);
		String tag2 = currentInput.substring(secondOpen +2, secondClose);
		int hasTag2 = currentInput.indexOf("</"+tag2+">");
		
		int hrefTag = currentInput.indexOf("=\"");
		int closeHREFTag= currentInput.indexOf("\"", hrefTag);
		
		if (open == -1 && close == -1)
		{
			htmlChecker = false;
		}
	
		else if (currentInput.contains("< >") || currentInput.contains("<>"))
		{
			htmlChecker = false;
		}
		
		else if (currentInput.equals("<P>"))
		{
			htmlChecker = true;
		}
		
		else if (hasTag2 == -1)
		{
			htmlChecker = false;
		}
		
		else if (tag.equalsIgnoreCase(tag2))
		{
			htmlChecker = true;
		}
		
		else if (hrefTag != -1 && currentInput.substring(open +1, hrefTag ).equals("A HREF") && closeHREFTag != -1 )
		{
			htmlChecker = true;
		}
		
		
		return htmlChecker;
	}

	
	/**
	 * Checks if supplied String matches ANY of the topics in the twitterChecker
	 * Returns true if it does find a match and false if it does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean twitterChecker(String currentInput)
	{
		boolean tweetChecker = false;
		int hashIndex = -99;
		int atIndex = -99;
	
		hashIndex = currentInput.indexOf("#");
		atIndex = currentInput.indexOf("@");
		
		if (hashIndex == -1 && atIndex == -1)
		{
			tweetChecker = false;
		}
		else
		{
			if (!currentInput.substring(hashIndex +1, hashIndex +2).equals(" ") || !currentInput.substring(atIndex +1,  atIndex +2).equals(" "))
			{
				tweetChecker = true;
			}
		}
		return tweetChecker;
		
	}
	
	/*
	 * checks to see if user wants to quit the program.
	 * if quit is typed the it returns true and the quit method will execute.
	 */
	public boolean quitChecker(String currentInput)
	{
		boolean checkQuit = false;
		
		if (currentInput.equals("exit"))
		{
			checkQuit = false;
		}
		if (currentInput.equals("quit"))
		{
			checkQuit = true;
		}
		
		return checkQuit;
	}

	

	/**
	 * Returns the username of this Chatbot instance.
	 * 
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * Returns the content area for this Chatbot instance.
	 * 
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * 
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	/**
	 * Getter method for the politicalTopicList object.
	 * 
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	/**
	 * Getter method for the keyboardMashChecker object.
	 * 
	 * @return The reference to the keyboardMashChecker list.
	 */
	public ArrayList<String> getKeyboardMashChecker()
	{
		return keyboardMashChecker;
	}
	/**
	 * Getter method for the inputHTMLChecker object.
	 * 
	 * @return The reference to the inputHTMLChecker list.
	 */
	public ArrayList<String> inputHTMLChecker()
	{
		return inputHTMLChecker;
	}
	/**
	 * Getter method for the twitterChecker object.
	 * 
	 * @return The reference to the twitterChecker list.
	 */
	public ArrayList<String> twitterChecker()
	{
		return twitterChecker;
	}
	
	public ArrayList<String> quitChecker()
	{
		return quitChecker;
	}

	/**
	 * Updates the content area for this Chatbot instance.
	 * 
	 * @param content
	 *            The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;

	}
}
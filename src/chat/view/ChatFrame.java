package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.Dimension;

public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	
	public ChatFrame(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("GUI");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}

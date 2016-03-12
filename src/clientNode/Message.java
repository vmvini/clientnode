package clientNode;

import java.io.File;
import java.io.FileNotFoundException;

import clientNode.FileUtils;

public class Message {
	
	private String currentLastMsg;
	private File file;
	
	public Message(File file) throws FileNotFoundException{
		this.file = file;
		this.currentLastMsg = getLastLine();
		
	}
	
	public String getLastLine() throws FileNotFoundException{
		return FileUtils.tail(this.file);
	}
	
	public String getLastMsg(){
		return currentLastMsg;
	}
	
	public boolean hasNewMessage() throws FileNotFoundException{
		String lastLine = getLastLine();
		if(lastLine == null) lastLine = "";
		if(!lastLine.equals(this.currentLastMsg)){
			this.currentLastMsg = lastLine;
			return true;
		}
		else
			return false;
		
	}

}

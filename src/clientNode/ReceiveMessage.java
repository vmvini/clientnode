package clientNode;

import java.io.File;
import java.io.FileNotFoundException;

public class ReceiveMessage extends Thread{

	private File file;
	public ReceiveMessage(File file){
		this.file = file;
		
	}
	
	public void run() {
		try {
		
			Message msg = new Message(this.file);
			
			while(true){
				
					
					Thread.sleep(1000);
					if(msg.hasNewMessage()){
						//tem nova mensagem
						System.out.println("Nova mensagem: " + msg.getLastMsg());
					}
					
					
				
			}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		
	}
	
	

}

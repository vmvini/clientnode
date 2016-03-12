package clientNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SendMessage extends Thread {
	
	private File file;
	public SendMessage(File file){
		this.file = file;
		
	}
	
	public void run(){
		while(true){
			try {
				
				Thread.sleep(1000);
				Scanner n = new Scanner(System.in);
				String msg = n.nextLine();
				writeOnFile(msg, this.file);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void writeOnFile(String msg, File file) throws IOException{
		FileWriter fw = new FileWriter(file, true);
		fw.write(msg+"\n");
		fw.close();
	}

}

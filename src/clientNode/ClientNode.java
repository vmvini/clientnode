package clientNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClientNode {
	
	
	
	public static void main(String[] args){
		String sfile1 = "/home/vmvini/Documentos/chat/sendMsgs.txt";
		String sfile2 = "/home/vmvini/Documentos/chat/receivedMsgs.txt";
		
		File sendedMsgsFile = new File(sfile1);
		File receivedMsgsFile = new File(sfile2);
		
		
		
		System.out.println("Digite suas mensagens: \n");
		SendMessage sm = new SendMessage(sendedMsgsFile);
		sm.start();
		
		
		
		ReceiveMessage rm = new ReceiveMessage(receivedMsgsFile);
		rm.start();
		
		
	}
	
	
	
	
	
	

}

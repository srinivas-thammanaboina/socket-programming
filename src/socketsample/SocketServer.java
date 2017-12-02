package socketsample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws Exception{

		System.out.println("server is started");
		
		ServerSocket ssc = new ServerSocket(9999);
		
		System.out.println("server is waiting for client request");
		
		Socket s = ssc.accept();
		
		System.out.println("client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = br.readLine();
		
		System.out.println("client data is "+ str);
	}

}

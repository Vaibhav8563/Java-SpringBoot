package clientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client");
            // Create a ServerSocket that listens on port 9803
            ServerSocket ss = new ServerSocket(9803);
            // Accept an incoming client connection
            Socket soc = ss.accept();
            System.out.println("Connection Established");

            // Create a Scanner object to read input from the client
            Scanner in = new Scanner(soc.getInputStream());
            // Read an integer from the client
            int num = in.nextInt();

            // Create a PrintWriter object to send output to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            // Calculate the factorial and send the result to the client
            out.println("Factorial is: " + calculateFact(num));

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculateFact(int num) {
        int fact = 1;
        // Calculate factorial of the given number
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}








//public class EchoServer {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println("Waiting for client");
//			ServerSocket ss = new ServerSocket(9803);
//			Socket soc = ss.accept();
//			System.out.println("Connection Established");
//			
//			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//			int num = Integer.parseInt(in.readLine());
//			
//			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
//			out.println("Factorial is: "+calculateFact(num));
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	private static int calculateFact(int num) {
//		int fact=1;
//		for(int i=1; i<=num; i++) {
//			fact = fact*i;
//		}
//		return fact;
//	}
//
//}

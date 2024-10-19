package clientServer;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {

        try {
            System.out.println("Client Started");
            // Establish a connection to the server running on localhost at port 9803
            Socket soc = new Socket("localhost", 9803);

            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            // Read the number entered by the user
            int num = scanner.nextInt();

            // Send the number to the server
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(num);

            // Create a Scanner object to read the server's response
            Scanner in = new Scanner(soc.getInputStream());
            // Print the server's response to the console
            System.out.println(in.nextLine());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





//public class EchoClient {
//
//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("Clien Started");
//			Socket soc = new Socket("localhost", 9803);
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter a number: ");
//			int num = Integer.parseInt(br.readLine());
//			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
//			out.println(num);
//			//getoutput in screen
//			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//			System.out.println(in.readLine());
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		} 
//
//	}
//
//}

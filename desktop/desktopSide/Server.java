/**
Evan Wang
*/

package desktopSide;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Server extends JFrame
{

	private JPanel contentPane;
	private static ServerSocket ss;
	private static Socket s;
	private static BufferedReader br;
	private static InputStreamReader isr;
	private static String message ="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Server frame = new Server();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		try
		{
			ss = new ServerSocket(5000);
			s = ss.accept();
			isr = new InputStreamReader(s.getInputStream());//receive data from phone
			br = new BufferedReader(isr);
			message = br.readLine();
			System.out.println(message);
			isr.close();
			br.close();
			ss.close();
			s.close();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Create the frame.
	 */
	public Server()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesktopSide = new JLabel("Desktop side");
		lblDesktopSide.setBounds(10, 11, 111, 14);
		contentPane.add(lblDesktopSide);
	}
}

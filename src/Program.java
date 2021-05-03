import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Program implements ActionListener {

	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton searchButton = new JButton("Search");
	private JButton reviewButton = new JButton("Review");
	private JButton logoutButton = new JButton("Logout");
	private JButton backButton = new JButton("Previous Page");
	private JLabel titleLabel = new JLabel("BOOTLEG IMDB");
	private JLabel loginLabel = new JLabel("Please login");
	private JLabel searchLabel = new JLabel("Search");
	private JLabel signInName = new JLabel("Username: ");
	private JLabel signInPassword = new JLabel("Password: ");

	public void run() {
		gui();
		this.panel.add(this.searchButton);
		this.panel.add(this.reviewButton);
		this.panel.add(this.logoutButton);
		this.searchButton.addActionListener(this);
		this.reviewButton.addActionListener(this);
		this.logoutButton.addActionListener(this);

	}

	public void logout() {
		gui();
		this.loginLabel.setFont(new Font("Verdana", Font.PLAIN, 45));
		this.panel.add(this.loginLabel);
		this.panel.add(this.signInName);
		this.panel.add(this.signInPassword);

	}

	public void gui() {
		this.panel.removeAll();
		this.panel.setBorder(BorderFactory.createEmptyBorder(600, 600, 10, 500));
		// this.panel.setBounds(440, 440, 200, 200);
		this.panel.setLayout(new GridLayout(0, 1));
		this.panel.setBackground(Color.yellow);
		this.titleLabel.setFont(new Font("Verdana", Font.PLAIN, 55));
		this.panel.add(this.titleLabel);
		this.frame.add(panel, BorderLayout.CENTER);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setTitle("Our Gui");
		this.frame.pack();
		this.frame.setVisible(true);
	}

	public JLabel[] createMovieList() {
		JLabel[] movieList = new JLabel[10];
		movieList[0] = new JLabel("Pirates of The Caribbean");
		movieList[1] = new JLabel("Parasite");
		movieList[2] = new JLabel("Pain and Glory");
		movieList[3] = new JLabel("Diane");
		movieList[4] = new JLabel("Hustlers");
		movieList[5] = new JLabel("Apollo 11");
		movieList[6] = new JLabel("IT");
		movieList[7] = new JLabel("Inception");
		movieList[8] = new JLabel("Nobody");
		movieList[9] = new JLabel("Tenet");
		return movieList;

	}

	public void search() {
		gui();
		JLabel[] movieList = createMovieList();
		for (int i = 0; i < movieList.length; i++) {
			this.panel.add(movieList[i]);
		}
		this.panel.add(this.backButton);

	}

	public void review() {
		gui();
	}

	public static void main(String[] args) {
		new Program().run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		search();

	}

//	@overide
//	public void actionEvent(ActionEvent e) {
//		search();
//
//	}
//	
//	public void reviewButton(ActionEvent reviewButton) {
//		review();
//
//	}

}

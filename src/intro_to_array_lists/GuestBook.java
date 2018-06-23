package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public void createUI() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.setSize(500, 75);
		frame.setVisible(true);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook bg = new GuestBook();
		bg.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			String inputname = JOptionPane.showInputDialog("Please enter in a name.");
			names.add(inputname);
		}
		if (e.getSource().equals(view)) {
			String fmsg = "";
			for (int i = 0; i < names.size(); i++) {
				fmsg = fmsg + "Guest #" + (i+1) + " " + names.get(i) + " " + "\n";
			}
			JOptionPane.showMessageDialog(null,	fmsg);
		}
	}
}

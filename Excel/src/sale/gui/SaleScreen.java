package sale.gui;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SaleScreen extends JPanel {
	static String[] lotNumbers = {"T-15166","T-15231","T-15287"};

	public SaleScreen() {
		JFrame window = new JFrame();
		window.setTitle("Pricing Screen");
		window.setSize(1024, 768);
		window.setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		//ImageIcon icon = createImageIcon("images/middle.gif");
		
		//JComponent salePanel = makeTextPanel("Sale Panel");
		
		//JComponent[] salePanels;
		JComponent[] salePanels = new JComponent[lotNumbers.length];
		for (int i = 0; i < lotNumbers.length; i++) {
			salePanels[i] = makeTextPanel(lotNumbers[i].toString());
			tabbedPane.addTab(lotNumbers[i], null, salePanels[i], "Does Nothing");
			
		}
		window.add(tabbedPane);
	}
	
	protected JComponent makeTextPanel(String text) {
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1,1));
		panel.add(filler);
		return panel;
	}

}

package App;

import javax.swing.SwingUtilities;

import src.App.Cliente.Start.StartComponent;
public class App {
	public static void main(String[] args) {		
		Runnable run = new Runnable(){
			public void run() {
				StartComponent lig = new StartComponent();
				lig.getClass();
			}
		};
		SwingUtilities.invokeLater(run);
	}
}
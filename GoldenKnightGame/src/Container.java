import javax.swing.JFrame;

public class Container extends JFrame{
	
	public Container() {
		add(new Fase());
		setTitle("GOLDEN KNIGHT");
		setSize(1920,1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(true);
		setVisible(true);
	}
	
	public static void main (String []args) {
		new Container();
	}
}

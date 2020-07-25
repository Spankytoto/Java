import javax.swing.*;




public class Age {

	public static void main(String[] args) {

		int yearNow, yearBorn, userAge;
		String userData;
		userData = JOptionPane.showInputDialog("What year is now?");
		yearNow = Integer.parseInt(userData);
		userData = JOptionPane.showInputDialog("What year is your born?");
		yearBorn = Integer.parseInt(userData);
		userAge = yearNow - yearBorn;
		JOptionPane.showMessageDialog (null,"Your year of birth: " + userAge);

		
	}

}

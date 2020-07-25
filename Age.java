import javax.swing.*;




public class Age {

	public static void main(String[] args) {

		int yearNow, yearBorn, userAge;
		String userData;
		userData = JOptionPane.showInputDialog("Какой сейчас год?");
		yearNow = Integer.parseInt(userData);
		userData = JOptionPane.showInputDialog("В каком году вы родились?");
		yearBorn = Integer.parseInt(userData);
		userAge = yearNow - yearBorn;
		JOptionPane.showMessageDialog (null,"Ваш возраст: " + userAge);

		
	}

}

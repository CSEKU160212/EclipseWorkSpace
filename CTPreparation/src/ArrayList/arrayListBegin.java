package ArrayList;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class arrayListBegin {

	public static void main(String[] args) {

		ArrayList<Integer> myArray = new ArrayList<Integer>(25);

		System.out.println("Length of this ArrayList: " + myArray.size());
		for (int k = 0; k < 10; k++) {
			myArray.add(3 * k);
		}
		myArray.set(6, 44);
		System.out.println("Length Of my new ArrayList: " + myArray.size());

		for (int k = 0; k < myArray.size(); k++) {
			System.out.print(myArray.get(k) + " , ");
		}
	}

}

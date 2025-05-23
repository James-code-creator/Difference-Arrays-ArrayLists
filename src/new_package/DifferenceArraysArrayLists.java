package new_package;

import java.util.ArrayList;

public class DifferenceArraysArrayLists {

	public static void main(String[] args) {
		int[] random_values = new int[5]; // This is a fixed array that we have established with a size of 5.
		random_values[0] = 3; //values for each element in the array. We cannot add more than the 5 elements.
		random_values[1] = 33;
		random_values[2] = 132;
		random_values[3] = -13;
		random_values[4] = 0;
		
		System.out.println("Array created: ");
		for (int i = 0; i < random_values.length; i++)
		{
			System.out.print("Number: " + random_values[i] + ", "); //this will list all the elements in the established array
		}
		
		ArrayList<Integer> random_numbers = new ArrayList<Integer>(); //arraylists do not allow for primitive classes such as int and double, so we must use a wrapped class.
		random_numbers.add(3);
		random_numbers.add(44);
		random_numbers.add(1);
		random_numbers.add(3333);
		random_numbers.add(0);
		random_numbers.add(-111); //here we can add a 6th element, as there is no limit.
		
		System.out.println("\nArraylist created: ");
		for (int i = 0; i < random_numbers.size();i++)
		{
			System.out.print("Random number: " + random_numbers.get(i) + ", ");
		}
	}

}

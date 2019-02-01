/******* Advent of Code Day 01 Project 02   *************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01Project02Main {

	public static void main(String[] args) {

		String stringInt;
		ArrayList<Integer> frequencyList = new ArrayList<Integer>();
		ArrayList<Integer> frequencyChange = new ArrayList<Integer>();
		boolean foundRepeat=false;
		int newFrequency=0;
		int frequencyRepeats=0;
		
		try {
			File myFile = new File("frequency.txt");
			Scanner inputFile = new Scanner(myFile);

			while (inputFile.hasNext()) {
				stringInt = inputFile.nextLine();
				frequencyChange.add(Integer.valueOf(stringInt));
			}

			inputFile.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File IO error!");
			
		}

		while (!foundRepeat) {
			for (int i=0; i < frequencyChange.size(); i++) {
				
				newFrequency += frequencyChange.get(i);
		
				if (!frequencyList.contains(newFrequency))		
					frequencyList.add(newFrequency);
				else{
					frequencyRepeats = newFrequency;
					foundRepeat = true;
					break;
				}
			}
		}
		
		System.out.println(frequencyRepeats);

	}
}

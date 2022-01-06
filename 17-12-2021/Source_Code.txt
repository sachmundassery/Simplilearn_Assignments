package com.lis;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Lis {
	static int incre_subseq(List<Integer> arrOfElements, int size) {
		int seq_arr[] = new int[size];
		int i, j, max = 0;
		for (i = 0; i < size; i++)
			seq_arr[i] = 1;
		for (i = 1; i < size; i++)
			for (j = 0; j < i; j++)
				if (arrOfElements.get(i) > arrOfElements.get(j)&& seq_arr[i] < seq_arr[j] + 1)
					seq_arr[i] = seq_arr[j] + 1;
		for (i = 0; i < size; i++)
			if (max < seq_arr[i])
				max = seq_arr[i];
		return max;
	}

	public static void main(String args[]) {

		JOptionPane.showMessageDialog(null,"Longest Increasing Subsequence" , "WELCOME", JOptionPane.INFORMATION_MESSAGE);
		int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the Size of the array"));
		
		List<Integer> arrOfElements = new ArrayList<Integer>();
		JOptionPane.showMessageDialog(null,"Enter the Elements" , "Fill the Array", JOptionPane.INFORMATION_MESSAGE);
		for (int i=0; i<size; i++) {
			int index=i+1;
			arrOfElements.add(Integer.parseInt(JOptionPane.showInputDialog("Element No: "+index)));

		}
		JOptionPane.showMessageDialog(null,"The length of the longest increasing subsequence is " + incre_subseq(arrOfElements, size) , "Result", JOptionPane.INFORMATION_MESSAGE);

	
	}
}
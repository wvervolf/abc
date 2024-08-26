package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Set;

public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Port Indexing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JTextArea inputArea = new JTextArea();
		inputArea.setLineWrap(true);
		JButton submitButton = new JButton("Submit");
		JTextArea outputArea = new JTextArea();
		outputArea.setEditable(false);

		submitButton.addActionListener(e -> {
			String input = inputArea.getText();
			String[] indexes = input.split("\n");
			List<List<Integer>> parsedIndexes = IndexParser.parseIndexes(indexes);
			Set<List<Integer>> combinations = UniqueCombinationsGenerator.generateUniqueCombinations(parsedIndexes);
			outputArea.setText("");
			for (List<Integer> combination : combinations) {
				outputArea.append(combination.toString() + "\n");
			}
		});

		panel.add(new JScrollPane(inputArea));
		panel.add(submitButton);
		panel.add(new JScrollPane(outputArea));

		frame.add(panel);
		frame.setVisible(true);
	}
}
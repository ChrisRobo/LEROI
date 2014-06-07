//
package general;
//  Driver program for LEROI
//  Filename: LEROI.java
//  Purpose: To launch LEROI.
//
//  Created by Ross Flieger-Allison on 5/3/14.
//  Copyright (c) 2014 Ross Flieger-Allison. All rights reserved.
//

import java.util.Scanner;
import java.util.Vector;

public class LEROI {
	
	// Scanner for taking user input
	private static Scanner input = new Scanner(System.in);
	// Root neuron in neural network
	private static Neuron brain = new Neuron("root");
	// Priority queue for short-term memory storage
	private static Vector<Neuron> shortterm = new Vector<Neuron>();
	// Priority queue for long-term memory storage
	private static Vector<Neuron> longterm = new Vector<Neuron>();
	
	// Default constructor
	LEROI() {
	    System.out.println("Hi, I'm LEROI. Who are you?");
	    brain.addNeighbor("username", input.nextLine());
		System.out.println("Nice to meet you " + brain.getNeighbor("username").getValue() + ".");
		System.out.println("How can I help you today?");
		brain.addNeighbor("request", input.nextLine());
		System.out.println("You just said: \"" + brain.getNeighbor("request").getValue() + "\"");
		System.out.println("I'm a pretty dumb AI right now, so that's all I can really do.\nBye!");
		// Continue implementation...
	}
	
	// Main method and program driver
	public static void main(String[] args) {
		LEROI leroi = new LEROI();
	}
}
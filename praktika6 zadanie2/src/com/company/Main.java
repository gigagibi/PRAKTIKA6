package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	MovableRectangle mrect = new MovableRectangle(1, 1, 2, 2, 1, 1);
	if(mrect.checkSpeeds())
	{
		System.out.print("OK");
	}
	else
	{
		System.out.print("Not OK");
	}
    }
}

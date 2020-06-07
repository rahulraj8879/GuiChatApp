package com.rahulraj.Gui;

public class Main {

    public static void main(String[] args) {
	


        //open cmd telnet localhost 9091
        //after that directly type client username and enter
        // then the app is connected with gui chat and we can send and recieve msgs

        MainFrame mainFrame = new MainFrame(); //create the MainFrame object
        Thread thread  = new Thread(mainFrame); //run in a new thread
        thread.start(); //start the thread
    }
}

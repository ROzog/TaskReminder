package pl.bartekrobert.taskreminder.controllers;

import pl.bartekrobert.taskreminder.views.MainView;

import java.util.Scanner;


public class MainController {
    private MainView mainView;
    private Scanner scanner;

    public MainController() {
        mainView = new MainView();
        scanner = new Scanner(System.in);
    }
    public void start() {
        mainView.showWelcomeText();
        createMainLoop();
    }

    private void createMainLoop() {
        String userLogin;
        String userPassword;


    }

}


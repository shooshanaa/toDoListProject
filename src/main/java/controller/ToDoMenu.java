package controller;

import javax.swing.*;
import java.util.Scanner;

public class ToDoMenu {
    Scanner scanner = new Scanner (System.in);


    public void start(){
        this.showOptions();
        this.handleUserChoice();
        

    }

    private void handleUserChoice() {
        System.out.println("Choose an option: ");
        String userChoice = scanner.nextLine();

        switch (userChoice){
            case "1":
                // add
                break;
            case "2":
                // add
                break;
            case "3":
                // add
                break;
            case "4":
                // add
                break;
            case "5":
                // add
                break;
            case "6":
                // add
                break;



        }

    }

    private void showOptions() {
        System.out.println(
                "Welcome to ToDo application" +
                "\n 1. Add toDo item" +
                "\n 2. View toDo list" +
                "\n 3. View toDo item" +
                "\n 4. Remove item" +
                "\n 5. Update item" +
                "\n 6. Exit"
        );
    }
}

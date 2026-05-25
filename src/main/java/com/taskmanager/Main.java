package com.taskmanager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    TaskManager tm = new TaskManager();
    boolean runningFlag = true;

    Scanner input = new Scanner(System.in);
    String choice;

    while (runningFlag == true) {
        System.out.println("[1] Create Task");
        System.out.println("[2] Remove Task");
        System.out.println("[3] Show all Tasks");
        System.out.println("[4] Exit");

        choice = input.nextLine();

        if (choice.equals("1")) {
            System.out.print("Enter a title: ");
            String title = input.nextLine();

            System.out.print("Enter a description: ");
            String description = input.nextLine();

            System.out.print("Enter a deadline (optional): ");
                String in = input.nextLine();
                LocalDate deadline;

                    if (in.isEmpty()) {
                        deadline = null;
                    } else {
                        deadline = LocalDate.parse(in);
                    }

            tm.createTask(title, description, deadline);
        }

        if (choice.equals("2")) {
            System.out.print("Enter the id of the task to remove: ");
            int id = Integer.parseInt(input.nextLine());

            tm.removeTask(id);
        }

        if (choice.equals("3")) {
            System.out.print(tm.getAllTasksAsString());
        }

        if (choice.equals("4")) {
            runningFlag = false;
        }
    }

}
}

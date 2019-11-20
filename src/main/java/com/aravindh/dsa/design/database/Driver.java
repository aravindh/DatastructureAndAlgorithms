package com.aravindh.dsa.design.database;

import java.util.Scanner;

public class Driver {
    private static final String SPACE = " ";

    public static void main(String[] args) {
        System.out.println("Welcome to Database!!!");
        printLogo();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("db>");
            String input = scanner.nextLine();
            if("exit".equals(input)){
                System.out.println("Bye Bye !!");
                break;
            } else if("man".equals(input)){
                printManPage();
            } else if("SELECT".equals(input.split(SPACE)[0].trim())){

            } else if("INSERT".equals(input.split(SPACE)[0].trim())){

            } else if("DELETE".equals(input.split(SPACE)[0].trim())){

            } else if("DROP".equals(input.split(SPACE)[0].trim())){

            } else {
                System.out.println("Unrecognized command");
            }
        }
    }

    private static void printLogo() {
        String logo = "      /\\\n" +
                "     / \t\\\n" +
                "    / /\\ \\\n" +
                "   / /  \\ \\\n" +
                "  / /    \\ \\\n" +
                " / /      \\ \\\n" +
                "/ /        \\ \\\n" +
                "\\ \\        / /\n" +
                " \\ \\      / /\n" +
                "  \\ \\    / /\n" +
                "   \\ \\  / / \n" +
                "    \\ \\/ / \n" +
                "     \\  /\n" +
                "      \\/\n" +
                "SQL Lite...";
        System.out.println(logo);
    }

    private static void printManPage() {
        StringBuilder commandOptionsBuilder = new StringBuilder();
        commandOptionsBuilder.append("\nWelcome to man Page..\n");
        commandOptionsBuilder.append("SELECT\n");
        commandOptionsBuilder.append("\nDescription: Fetch records from given table.");
        commandOptionsBuilder.append("\nSyntax: SELECT <<* or List of columns>> FROM <<tableName>>");
        commandOptionsBuilder.append("INSERT\n");
        commandOptionsBuilder.append("\nDescription: Inserts values to given table.");
        commandOptionsBuilder.append("\nSyntax: INSERT INTO TABLE <<tableName>> VALUES <<List of values for columns in Order>>");
        commandOptionsBuilder.append("DELETE\n");
        commandOptionsBuilder.append("\nDescription: Deletes one/more records from given table");
        commandOptionsBuilder.append("\nSyntax: DELETE FROM <<tableName>> where <<condition>>");
        commandOptionsBuilder.append("DROP\n");
        commandOptionsBuilder.append("\nDescription: Remove table with given name.");
        commandOptionsBuilder.append("\nSyntax: DROP TABLE <<tableName>>");
        System.out.println(commandOptionsBuilder.toString());
    }
}

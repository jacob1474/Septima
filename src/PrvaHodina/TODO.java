package PrvaHodina;

import java.util.Scanner;

public class TODO {
    private static String[] todos = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
        do {

            /*
            System.out.println("Hello!"+
            "\nWhat do you want to do?\n" +
            "[S]ee all TODOs\n" +
            "[A]dd a TODO\n" +
            "[R]emove a TODO\n" +
            "[E]xit");
            */

            System.out.println("Hello!");
            System.out.println("What do you want to do?");
            System.out.println("[S]ee all TODOs");
            System.out.println("[A]dd a TODO");
            System.out.println("[R]emove a TODO");
            System.out.println("[E]xit");


            input = scanner.next().toLowerCase().charAt(0);
            
            switch (input) {
                case 's':
                    printTodos();
                    break;
                case 'a':
                    System.out.println("Enter your TODO:");
                    addTodo(scanner.next());
                    break;
                case 'r':
                    System.out.println("Enter the number of the TODO you want to remove:");
                    removeTodo(scanner.nextInt());
                    break;
                case 'e':
                    System.out.println("Closing program...");
                    break;
                default:
                    System.out.println("Incorrect input!");
            }
        } while (input != 'e');
    }

    public static void addTodo(String todo) {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
        System.out.println("TODO added! Description: "+todo);
    }

    public static void removeTodo(int userInput) {
        todos[userInput] = null;
    }

    public static void printTodos() {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] != null) {
                System.out.println(todos[i]);
            }
        }
    }
    
}

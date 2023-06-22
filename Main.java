/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

// Kelas Task merepresentasikan sebuah tugas dalam program
class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }
}

// Kelas TaskManager mengelola daftar tugas
class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        Task newTask = new Task(name);
        tasks.add(newTask);
        System.out.println("Tugas \"" + name + "\" ditambahkan.");
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsCompleted();
            System.out.println("Tugas \"" + task.getName() + "\" ditandai sebagai selesai.");
        } else {
            System.out.println("Indeks tugas tidak valid.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            System.out.println("Daftar Tugas:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.print(i + 1 + ". " + task.getName());
                if (task.isCompleted()) {
                    System.out.println(" (Selesai)");
                } else {
                    System.out.println();
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Mengerjakan tugas matematika");
        taskManager.addTask("Menulis laporan proyek");
        taskManager.displayTasks();

        taskManager.markTaskAsCompleted(1);
        taskManager.displayTasks();
    }
}

package app;

import model.entities.Department;

public class App {
    public static void main(String[] args) throws Exception {
        Department department = new Department(1, "Books");
		System.out.println(department);
    }
}

/*
    Вариант 7.

        Реализовать класс-стек, реализующий методы добавления элементов, извлечения и очистки.
 */

package general_team_tasks.variant_07;

public class Main {
    public static void main(String[] args) {
        TaskClass<Integer> stack = new TaskClass<>();

        for (int i = 0; i < 100; i++) {
            stack.push(i + 1);
            System.out.println("Iteration: " + (i + 1) + "; Size: " + stack.size() + "; Top: " + stack.peek());
        }

        System.out.println("\nStack output: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
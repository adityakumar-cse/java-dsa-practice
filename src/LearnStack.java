import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Cat");
        animal.push("Tiger"); // add the element

        System.out.println("Stack : " + animal);
        System.out.println(animal.peek()); // which element is in top
        animal.pop(); // remove the element
        System.out.println(animal.peek());

    }
}

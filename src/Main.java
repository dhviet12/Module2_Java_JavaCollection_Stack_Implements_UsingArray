public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        System.out.println(stack.size());

    }
}

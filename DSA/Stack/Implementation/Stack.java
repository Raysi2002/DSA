package Implementation;

class Stack{
    private int[] stack = new int[10];
    private int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }

    public int pop(){
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek(){
        int temp = top - 1;
        return stack[temp];
    }

    public void display(){
        int start = top - 1;
        for(int i = start; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
    }
}
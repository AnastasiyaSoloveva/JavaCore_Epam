package homework.lesson170712;

import mytestframework.SimpleUnit;

public class UseStringStack {


    public static void main(String[] args) {

        StringStack myStack = new StringStack();
        System.out.println(myStack);


        System.out.println(SimpleUnit.assertEquals(myStack.push("one"),true));
        myStack.push("two");
        myStack.push("three");
        System.out.println(myStack);

        System.out.println(SimpleUnit.assertEquals(myStack.pop(),"three"));
        System.out.println(SimpleUnit.assertEquals(myStack.tos(),"two"));

        System.out.println(myStack);

        System.out.println(SimpleUnit.assertEquals(myStack.size(),2));

        myStack.pop();
        myStack.pop();

        System.out.println(SimpleUnit.assertEquals(myStack.size(),0));

















    }


}

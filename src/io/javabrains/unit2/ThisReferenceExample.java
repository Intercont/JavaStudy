package io.javabrains.unit2;

public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        thisReferenceExample.doProcess(10, i -> {
//                System.out.println("Value of i: " + i);
////                System.out.println(this); //The "this" doesn't work in Lambda calls inside a static context like main
//            });
        //call by old Java 7 Anonymous Inner Class
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i: " + i);
                System.out.println(this);
            }

            public String toString() {
                return "This is the anonymous inner class, the 'this' is pointing to the reference of the anonymous inner class ";
            }
        });

        //Call through Lambda Java 8 with this inside a non static method execute
        thisReferenceExample.execute();
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i: " + i);
            System.out.println(this); //Instead, if it's on a method that's not static, it works!
        });
    }

    @Override
    public String toString() {
        return "This is the main ThisReferenceExample class instance. The 'this' on the Lambda is pointing to the reference of the " +
                "caller object, in this case, the reference of thisReferenceExample object";
    }
}

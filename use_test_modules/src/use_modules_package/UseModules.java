package use_modules_package;

import test.package1.TestClass1;
import test.package2.TestClass2;

public class UseModules {

    public static void main(String[] args) {

        TestClass1 testClass1 = new TestClass1();
        testClass1.print();

        TestClass2 testClass2 = new TestClass2();
        testClass2.print();
    }
}

package com.example;

public class Example {
    public static void main(String[] args) throws java.io.IOException {
        System.err.println("JVM: " + java.lang.management.ManagementFactory.getRuntimeMXBean().getVmVersion());

        ClassLoader classLoader = Example.class.getClassLoader();
        System.out.println(classLoader);

        java.util.Enumeration<java.net.URL> resources = classLoader.getResources("");
        while (resources.hasMoreElements()) {
            System.out.println("-- " + resources.nextElement());
        }
    }
}

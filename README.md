After JDK 9, `ClassLoader#getResources("")` returns `jar:file:/...` path.

# Result

Run with Java 8

    JVM: 25.201-b09
    sun.misc.Launcher$AppClassLoader@2a139a55
    -- file:/Users/tokuhirom/work/urlclassloader-behavoiour/build/classes/java/main/

https://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html#getResources-java.lang.String-

Run with Java 11

    JVM: 11.0.1+13-LTS
    jdk.internal.loader.ClassLoaders$AppClassLoader@799f7e29
    -- file:/Users/tokuhirom/work/urlclassloader-behavoiour/build/classes/java/main/
    -- jar:file:/Users/tokuhirom/.gradle/caches/modules-2/files-2.1/net.bytebuddy/byte-buddy-agent/1.10.2/fbfe9bf099287c35b8336ea9da194f301a112a11/byte-buddy-agent-1.10.2.jar!/META-INF/versions/9/

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#getResources(java.lang.String)

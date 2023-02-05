A shim jar to put on your javac classpath to work around [JDK-8206937](https://bugs.openjdk.org/browse/JDK-8206937).

It contains the API definitions of the classes in the jdk.unsupported module to allow compilation with a release target of 8 on newer java compilers.

It is covered under the CC0 (Public Domain Dedication) license, because most likely API shims like this do not fall under copyright law (see Oracle v Google lawsuit in the US).

## Usage

Add the followind dependency specification to your compilation path (e.g. compileOnly configuration in gradle):
```
me.eigenraven.java8unsupported:java-8-unsupported-shim:1.0.0
```

Alternatively in maven pom.xml format:
```xml
<dependency>
    <groupId>me.eigenraven.java8unsupported</groupId>
    <artifactId>java-8-unsupported-shim</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```

This enables using classes like `sun.misc.Unsafe` when compiling with `javac --release 8`.

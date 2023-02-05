A shim jar to put on your javac classpath to work around [JDK-8206937](https://bugs.openjdk.org/browse/JDK-8206937).

It contains the API definitions of the classes in the jdk.unsupported module to allow compilation with a release target of 8 on newer java compilers.

It is covered under the CC0 (Public Domain Dedication) license, because most likely API shims like this do not fall under copyright law (see Oracle v Google lawsuit in the US).

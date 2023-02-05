plugins {
  `java-library`
  `maven-publish`
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(8))
    vendor.set(JvmVendorSpec.ADOPTIUM)
  }
  withSourcesJar()
}

group = "me.eigenraven.java8unsupported"
version = "1.0.0"

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["java"])

      artifactId = "java-8-unsupported-shim"

      pom {
        name.set("Java 8 jdk.unsupported shim")
        description.set("A shim jar to put on your compile classpath to work around [JDK-8206937](https://bugs.openjdk.org/browse/JDK-8206937).")
        url.set("https://github.com/eigenraven/java8UnsupportedShim")
        licenses {
          license {
            name.set("CC0 1.0 Universal (CC0 1.0) Public Domain Dedication")
            url.set("https://creativecommons.org/publicdomain/zero/1.0/")
          }
        }
        developers {
          developer {
            id.set("eigenraven")
            name.set("Raven Szewczyk")
            email.set("git@eigenraven.me")
          }
        }
        scm {
          connection.set("scm:git:https://github.com/eigenraven/java8UnsupportedShim.git")
          developerConnection.set("scm:git:ssh://git@github.com:eigenraven/java8UnsupportedShim.git")
          url.set("https://github.com/eigenraven/java8UnsupportedShim")
        }
      }
    }
  }

  repositories {
    maven {
      name = "GitHubPackages"
      url = uri("https://maven.pkg.github.com/eigenraven/java8UnsupportedShim")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }
  }
}

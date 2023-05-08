What is a valid packaging type for a Maven project?

- [ ] EAR
- [ ] POM
- [x] all of these answers
- [ ] WAR

---

What are the artifacts that Apache Maven uses to perform its build operations?

- [ ] properties
- [ ] ant files
- [ ] dependencies
- [x] plugins

---

The primary purpose of Apache Maven is to provide uniform, easy, and standardized _____.

- [ ] project structure
- [x] builds
- [ ] versioning
- [ ] source code style

---

Why is it best practice not to release SNAPSHOT versions of Maven artifacts to production?

- [x] A SNAPSHOT can be hard to reproduce, making it difficult to determine the cause of an issue.
- [ ] A release marked with SNAPSHOT may contain sensitive security information.
- [ ] A release marked with SNAPSHOT indicates that not all of the tests have passed.
- [ ] SNAPSHOT releases do not contain any dependencies.

---

In multimodule projects, what do child POMs inherit from the parent POM?

- [ ] version
- [x] all of these answers
- [ ] dependencies
- [ ] groupId

---

Why is it best practice to avoid overriding the default directory structure?

- [x] Keeping the default structure reduces onboarding time, because developers recognize it.
- [ ] Overriding the default structure is very complex.
- [ ] Overriding the default structure will cause Maven to take longer to compile your code.
- [ ] all of these answers

---

Why might you not want to include groupId and version elements in child POM files?

- [ ] Child POM files should include definitions of only dependencies and plugins.
- [ ] If you include these elements, an error will be thrown when you try to build the project.
- [x] These elements are inherited from the parent POM file, and do not need to be repeated.
- [ ] The values in the parent POM will be overridden by what is defined in the child POM.

---

Suppose you are packaging a Maven project and see the following error:
“[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!” What do you add to your POM file to set the platform encoding to ensure your build is not platform dependent?

- [ ] <project.compiler.encoding>
- [ ] <maven.compiler.source>
- [ ] <project.build.resources>
- [x] <project.build.sourceEncoding>

---

Below is a section of a settings.xml file. How can you use the path to the app home in your POM file?

```xml
<profiles>
  <profile>
    <id>set-app-home</id>
    <properties>
      <maven-people-plugin>
      <artifactId>
      <applicationhome>/path/to/application</application-home>
    </properties>
  </profile>
</profiles>
<activeProfiles>
  <activeProfile>set-app-home</activeProfile>
</activeProfiles>
```

- [ ] ${activeProfile}
- [ ] ${/path/to/application}
- [ ] ${set-app-home}
- [x] ${application-home}

---

When building a Maven project, where are Maven dependencies stored?

- [ ] online in the Maven central repository
- [ ] in the target directory
- [x] in your local repository
- [ ] in the POM file

---

How do you check for unused dependencies in your project?

- [x] Run the analyze goal of the dependency plugin.
- [ ] You will need to do this manually.
- [ ] Run mvn clean and look at which plugins are not mentioned in the output.
- [ ] Include the Maven dependency plugin in your POM file and run the unpack goal.

---

What is one of the advantages of using properties in Maven?

- [ ] Properties allow you to inherit values from the parent POM in the child POM.
- [ ] Properties provide a template for you to build Maven projects with a certain structure.
- [x] You can avoid hard-coding values in multiple places.
- [ ] Properties speed up your Maven build.

---

Which plugin runs a test named LinkedInIT without explicitly configuring includes and excludes?

- [ ] Integration Tests
- [ ] JaCoCo
- [x] Failsafe
- [ ] Surefire

---

What argument do you pass to Maven in order to update SNAPSHOTs from the remote repository?

- [ ] -S
- [ ] -X
- [x] -U
- [ ] -J

---

What command can you use to run the `compile` goal of the compiler plugin?

- [ ] mvn compiler->compile
- [ ] mvn compiler>compile
- [x] mvn compiler:compile
- [ ] mvn compiler-compile

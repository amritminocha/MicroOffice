# MicroOffice

Problem) A software company MicroOffice has produced four generations of Word Processing Applications, called Word90, Word00, Word10, and Word21. Suppose you are writing a program to test their GUIs. The GUI components we are interested in are Panel, Button, and Textbox. These GUI components look a little different in different generation. Each generation has it own program for testing these GUI components. To know which test to run, you will need to instantiate objects that correspond to each one of the GUI components.

 

We assume that generations of the Word to be tested are stored in a configuration file (text file). Because this situation fits the Abstract Factory pattern so well, you can use that pattern to organize the creation of objects that correspond to GUI components. You will also need to use the variation of singleton pattern to ensure that at most two instances of each generation in each test run. Please note finishing running all generations specified in the configuration file is considered as one test run.

Here is an example of the configuration file content. You can create your own.
Word90
Word00
Word90
Word21
Word10
Word00
Word21
Word90
Word00

Give the code (in any language) based on the UML class diagram given in 1). As output, you need to display three different messages (e.g., “Panel Word90”, Button Word90”, and “Textbox Word90”) for the generation specified in configuration file. You should give a warning message if the same generation are asked to run more than twice.

To run the following code, follow the steps below: 

STEPS TO RUN IT IN THE TERMINAL
1) Open the terminal and locate the project in the terminal:
  - cd Assignment_2/CIS566_Code/src
2) Compile the Java code by running the following command: 
  - javac Main.java
3) Run the program by executing the following command: 
  - java Main
4) The program will execute, and you will see the output in the command prompt or terminal. It will display the messages for the GUI components of each Word generation specified in the CONFIG_LIST. If a generation is asked to run more than twice, it will display a warning message.
5) If you want to edit the configuration file, edit the Configuration.java file and modify it with the updated configurations.

STEPS TO RUN IN IntelliJ IDEA:
1) Open IntelliJ IDEA and open the project
2) Navigate the main class
3) Right-click on the Main class within the IntelliJ IDEA project explorer.
4) Select "Run Main.main()" from the context menu.
5) The program will execute, and you will see the output in the IntelliJ IDEA console.


TO READ THE CONFIGURATIONS FROM Configuration.txt

a. Create a config.txt in the same location as the Configuration.java class and save the following code:
```
Word90
Word00
Word90
Word21
Word10
Word00
Word21
Word90
Word00
```

b. Replace the Configuration file with the code below: 
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;
public class Configuration {
public static List<String> getConfigList() {
List<String> CONFIG_LIST = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader("config.txt"))) {
String line;
while ((line = br.readLine()) != null) {
CONFIG_LIST.add(line); }
} catch (IOException e) { e.printStackTrace();
}
return CONFIG_LIST; }
}
```

c. In main(), change in line 10:
FROM this:
```
for (String configuration : Configuration.CONFIG_LIST)
```
TO this:
```
for (String configuration : Configuration.getConfigList())
```

d. If we run the Main class now, it will run the same way and we can just edit the text file to modify configuration.

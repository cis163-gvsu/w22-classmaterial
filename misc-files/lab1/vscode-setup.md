# Setting Up VSCode

VSCode is a general purpose editor which can be used for many
programming languages.  Unlike some IDEs, it is not language
specific.  To help it bridge the gap between an editor and an
IDE, there are "extensions" that perform many of the functions
that IDEs would perform.

## Downloading/Installing
### Mac/Windows Users
Go to [VSCode Java Tutorial](https://code.visualstudio.com/docs/java/java-tutorial)
and click the appopriate link under "Coding Pack for Java".  There
is one for both macOS and Windows.  This will come with both the Java JDK
(the progamming language itself) and the Java extensions.  


### Linux Users
If you run on Linux), you'll have to install the parts separately:
* VS Code:  Follow the steps at [VSCode Linux Instructions](https://code.visualstudio.com/docs/setup/linux)
* Once it's installed, open it and look for the Extensions option (should either show up right away
  or in the left bar look like a square of 4 blocks with the upper right one removed)
* Search for "java" and select "Extension Pack for Java" (should say Microsoft underneath)
* If you don't already have java downloaded, you'll need to install the JDK (use whatever package
  manager you use regularly on your computer).

## Getting Started
1. Click "Creat Java Project"
2. At the top select "No build tools"
3. Navigate to the higher level directory where you want to store your projects for this course
4. Type in the name for this project (You can use whatever you want for this one)
5. If you click on `src` it should show you an `App.java`.  This is the starter code it adds for all
   all projects.  You probably want to rename this by right clicking and replacing `App` with the name of your
   class. 
6. On `src` you can right-click to create new files, etc.
7. Edit the `App.java` (or whatever you renamed it) to be a simple "Hello World" program.
8. Click next to the main function and verify that it runs and prints out the message at the bottom.

## Create a new project for this lab
You can either close and reopen or go up to "File" at the top and select "New Window".
1. Decide where you want to put it and give it whatever name you'd like.
2. In `src`, renamge `App.java` to `Book.java`.
3. Copy the contents of [Book.java](misc-files/lab1/Book.java) into this file (replacing whatever
   was there).
4. Create a new file named `BookTest.java` and copy the contents of [BookTest.java](misc-files/lab1/BooKTest.java)
   into that file.

## Setup Unit Testing
### Steps to do once
1. Download junit-4.13.2.jar from [https://search.maven.org/search?q=g:junit%20AND%20a:junit](https://search.maven.org/search?q=g:junit%20AND%20a:junit)
   Save it somewhere on your computer that you'll remember (you'll need to know where it is regularly)
2. Download `hamcrest-core-1.3.jar` from
   [https://search.maven.org/artifact/org.hamcrest/hamcrest-core/1.3/jar](https://search.maven.org/artifact/org.hamcrest/hamcrest-core/1.3/jar).
   You'll need to click "Downloads" in the upper right and select "jar".  
   Save it somewhere on your computer that you'll remember (you'll need to know where it is regularly).

### Steps to do for every project
1. In your java project, at the bottom left you should see "Java Projects". Inside that you should
   see "Referenced Libraries". Click on it
2. Click the `+` and navigate to where you saved the two .jar files.  Select both of them

## Verify your Test Setup is Working
1. Go to BookTest.java and click next to the line `public class BookTest`.  This should run all the test.
2. Click the beaker ("Testing") to see which tests passed/failed.
3. One test is broken.  Read through the code, figure out what's wrong with the function(s) called in that
   test.  Once you've fixed it, call me over so I can check your work and see that you are passing all of them.
   You shouldn't edit the actually tests -- fix the code itself.

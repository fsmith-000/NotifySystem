# NotifySystem
This repositiory contains a project that serves as a notification system simulation. It simulates delivering a message to someone's email, sms, and in module 5 whatsApp was added. Module 5 is the most up to date version of this project. The user has the option to run either module 4 or 5, but not both at the same time.

Module 4 contains a bug that was corrected in Module 5. The ability to exit the application does not work correctly. You can still exit the application, but it does not work as intended. However The exiting bug works properly in module 5.

No specialized third party libraries are needed for this application. The project was designed and tested in Windows 11 using: 
openjdk 21 2023-09-19
OpenJDK Runtime Environment (build 21+35-2513)

There is a Javadocs file called allclasses-index.html in both Module-4 and Module-5. There are a few differences between the two files. There you will find some comments about the implementation.

DEPLOYMENT INSTRUCTIONS:
Download either module-4 java files OR Module-5 java files onto your computer and take note of where you place them. Copy the path of the files so you can later paste it.
In a windows machine goto the command line interface (cmd). I ususally open up cmd as an administrator, but this is not strictly required.
in cmd, type in "cd" and then a space. Finally type <ctrl-v> to paste in the path of your files. Press "ENTER"
This will move you to the directory where the module 4 files are.
Next compile the .java files with this command:
javac -d bin *.java
Finally, to run the application use this command:
java -cp bin NotifySystem.java
This will rune module 4 or module 5.

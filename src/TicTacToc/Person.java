
package TicTacToc;

public class Person {
/* Date fields */
private int ID;
private String name, email;

/* Constructor */
    // no-arg constructor
public Person() {

    }
// Constructor
public Person(int ID, String name, String email){
this.ID = ID;
this.name = name;
this.email= email;
    }
/* Getters and setters */
    // ID getter
public int getID() {
return ID;
    }

// ID setter
public void setID(int ID) {
this.ID = ID;
    }

// name getter
public String getName() {
return name;
    }

// name setter
public void setName(String name) {
this.name = name;
    }

// email getter
public String getEmail() {
return email;
    }

// email setter
public void setEmail(String email) {
this.email= email;
    }
}


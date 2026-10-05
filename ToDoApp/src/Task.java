public class Task{
private String description;
private boolean isCompleted;

public Task(String description){
this.description = description;
this.isCompleted = false;
}

public String getdescription(){
return description;
}

public boolean isCompleted(){
 return isCompleted;
}

public void markCompleted() {
        this.isCompleted = true;
    }

public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }

public String toDataString(){

}
}
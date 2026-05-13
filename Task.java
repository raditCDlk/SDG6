public class Task {
    private int id;
    private String title;

    //constructor
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //getters setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
      public String toString(){
          return "Task ID: " + id + " | Title: " + title;
      }
}

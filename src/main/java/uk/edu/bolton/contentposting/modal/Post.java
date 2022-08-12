package uk.edu.bolton.contentposting.modal;

public class Post {

    private String name;

    public Post() {
    }

    public Post(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                '}';
    }
}

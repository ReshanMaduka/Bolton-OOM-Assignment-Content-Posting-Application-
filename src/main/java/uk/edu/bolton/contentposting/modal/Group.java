package uk.edu.bolton.contentposting.modal;

public class Group {

    private String post;
    private String name;

    public Group() {
    }

    public Group(String post, String name) {
        this.post = post;
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "post='" + post + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

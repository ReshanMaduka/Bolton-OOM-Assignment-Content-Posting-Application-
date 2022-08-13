package uk.edu.bolton.contentposting.modal;

public class Channel {

    private String name;

    public Channel() {
    }

    public Channel(String name) {

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
        return "Group{" +
                " name='" + name + '\'' +
                '}';
    }
}

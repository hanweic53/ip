public class Event extends Task {

    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toText() {
        String completionStatus = "0";
        if (this.isDone) {
            completionStatus = "1";
        }
        return "E" + " | " + completionStatus + " | " + this.description + " | "
                + this.at;
    }

    @Override
    public String toString() {
        return "[E]" + this.getStatusIcon() + " " + super.toString() + " (at: " + at + ")";
    }
}
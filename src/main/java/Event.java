import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    protected LocalDateTime at;

    public Event(String description, LocalDateTime at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + this.getStatusIcon() + " " + super.toString() + " (at: " +
                at.format(DateTimeFormatter.ofPattern("dd MMM yyyy, HHmm")) + ")";
    }
}
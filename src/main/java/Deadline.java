import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    protected LocalDateTime by;

    public Deadline(String description, LocalDateTime by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + this.getStatusIcon() + " " + super.toString() + " (by: " +
                by.format(DateTimeFormatter.ofPattern("dd MMM yyyy, HHmm")) + ")";
    }
}
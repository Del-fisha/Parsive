package parsive.models;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatterDateAndTime {
    public static final DateTimeFormatter OUTPUT_FORMATTER =
            DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm", Locale.forLanguageTag("ru-RU"));
}

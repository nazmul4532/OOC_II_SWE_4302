import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record Subject(String subjectCode, String subjectName) {
    private static final String DELIMITER = ": ";

    private static Path getPath(String filename) throws URISyntaxException {
        URL url = Subject.class.getResource(filename);
        URI uri = url.toURI(); // throws java.net.URISyntaxException
        return Paths.get(uri);
    }

    private static Subject makeSubject(String line) {
        String[] parts = line.split(DELIMITER);
        return new Subject(parts[0].trim(), parts[1].trim());
    }

    /**
     * Reads contents of a text file and converts its contents to a list of
     * instances of this record and displays that list.
     *
     * @param args - not used.
     */
    public static void main(String[] args) {
        try {
            Path path = getPath("subjects.txt");
            try (Stream<String> lines = Files.lines(path)) { // throws java.io.IOException
                lines.map(Subject::makeSubject)
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
            }
        }
        catch (IOException | URISyntaxException x) {
            x.printStackTrace();
        }
    }
}

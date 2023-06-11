package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Lines.
 *
 * @author Igor_Zolov
 */
public class Lines {

    public static void main(String[] args) {
        Path path = Paths.get("/root/test.txt");

        try (Stream<String> lines = Files.lines(path)) {
            List<String> collected = lines.toList();
        } catch (IOException ex) {
            // ignore
        }
    }

}

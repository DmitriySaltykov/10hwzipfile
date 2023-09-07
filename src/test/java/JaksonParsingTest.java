

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

    public class JaksonParsingTest {

        private final ClassLoader cl = JaksonParsingTest.class.getClassLoader();
        private final ObjectMapper mapper = new ObjectMapper();

        @Test
        void jacksonJsonTest() throws Exception {
            try (InputStream stream = cl.getResourceAsStream("student.json")) {
                ModelJava student = mapper.readValue(stream, ModelJava.class);

                Assertions.assertEquals("01", student.getId());
                Assertions.assertEquals("Dim", student.getFirstName());
                Assertions.assertEquals("Vit", student.getLastName());
                Assertions.assertEquals("Client", student.getClientType());
                Assertions.assertEquals("Bi2pay", student.getOrganization());
            }
        }
    }


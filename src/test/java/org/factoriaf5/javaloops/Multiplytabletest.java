package org.factoriaf5.javaloops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class Multiplytabletest {
    
    @Test
    public void testGenerateTable() {
        int n = 5;
        String[] expected = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };

        String[] result = Multiplytable.generateTable(n);

        assertThat(result, is(expected));
    }
}


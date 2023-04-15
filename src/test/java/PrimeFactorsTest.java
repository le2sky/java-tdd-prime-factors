import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

    @Test
    void prime_factors() {
        assertThat(factors(1)).isEqualTo(Arrays.asList());
    }

    private List<Integer> factors(int n) {
        return Arrays.asList();
    }
}

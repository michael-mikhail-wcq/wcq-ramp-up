/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wcq.ramp.up;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GCDTest {
    @Test
    void NegativeNumber() {
        assertEquals(GCDEuclideanAlg.findGCD(new int[] {4420, -128, 8984, -488}), -4);
    }

    @Test
    void PositiveNumer() {
        assertEquals(GCDEuclideanAlg.findGCD(new int[]{455, 550, 150, 250, 430}), 5);
    }

}

package org.example

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class RoverTest {

    @Test
    fun `when deployed outside the map boundaries then should RIP`() {
        val map = Maps(10, 10)
        val rover = Rover(70, 80, 'N')

        // when
        assertFalse(rover.isValidLocation(map))
    }
}
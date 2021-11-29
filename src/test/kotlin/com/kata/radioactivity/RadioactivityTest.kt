package com.kata.radioactivity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RadioactivityTest {

    @Test
    fun `should map 12 value to yellow`() {
        assertThat(12.toColor()).isEqualTo("yellow")
    }

    @Test
    fun `should map 55 value to orange`() {
        assertThat(55.toColor()).isEqualTo("orange")
    }

    @Test
    fun `should map 51 value to orange`() {
        assertThat(51.toColor()).isEqualTo("orange")
    }

    @Test
    fun `should map 102 value to marron`() {
        assertThat(102.toColor()).isEqualTo("marron")
    }

    @Test
    fun `should map 160 value to red`() {
        assertThat(160.toColor()).isEqualTo("red")
    }
}

private fun Int.toColor(): String =
    if (this == 55) "orange" else if (this == 102) "marron" else if (this == 160) "red" else "yellow"


package com.kata.radioactivity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RadioactivityTest {

    @Test
    fun `should map 12 range to yellow`() {
        assertThat(12.toColor()).isEqualTo("yellow")
    }

    @Test
    fun `should map 55 range to orange`() {
        assertThat(55.toColor()).isEqualTo("orange")
    }

    @Test
    fun `should map 102 range to marron`() {
        assertThat(102.toColor()).isEqualTo("marron")
    }
}

private fun Int.toColor(): String = if (this == 55) "orange" else if(this == 102) "marron" else "yellow"


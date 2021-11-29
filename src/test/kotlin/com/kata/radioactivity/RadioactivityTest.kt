package com.kata.radioactivity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RadioactivityTest {

    @Test
    fun `should return yellow if the value is between 0 and 50`() {
        assertThat(0.toColor()).isEqualTo("yellow")
        assertThat(12.toColor()).isEqualTo("yellow")
        assertThat(50.toColor()).isEqualTo("yellow")
    }

    @Test
    fun `should return orange if the value is between 51 and 100`() {
        assertThat(51.toColor()).isEqualTo("orange")
        assertThat(70.toColor()).isEqualTo("orange")
        assertThat(100.toColor()).isEqualTo("orange")
    }

    @Test
    fun `should return marron if the value is between 101 and 150`() {
        assertThat(101.toColor()).isEqualTo("marron")
        assertThat(112.toColor()).isEqualTo("marron")
        assertThat(150.toColor()).isEqualTo("marron")
    }

    @Test
    fun `should return red for every value greater than 150`() {
        assertThat(151.toColor()).isEqualTo("red")
        assertThat(160.toColor()).isEqualTo("red")
    }
}

private fun Int.toColor(): String = when (this) {
    in 0..50 -> "yellow"
    in 51..100 -> "orange"
    in 101..150 -> "marron"
    else -> "red"
}


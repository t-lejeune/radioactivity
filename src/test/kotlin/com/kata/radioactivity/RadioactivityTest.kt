package com.kata.radioactivity

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RadioactivityTest{

    @Test
    fun `should map 0-50 range to yellow`(){
        val radioactivityRate = 12
        Assertions.assertThat(radioactivityRate.toColor()).isEqualTo("yellow")
    }

    @Test
    fun `should map 51-100 range to orange`(){
        val radioactivityRate = 55
        Assertions.assertThat(radioactivityRate.toColor()).isEqualTo("orange")
    }

}

private fun Int.toColor(): String {

    return "yellow";
}

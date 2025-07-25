package com.example.tax

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.math.ln
import kotlin.math.min

@RestController
class TaxController {

    @GetMapping("/tax-rate")
    fun getTaxRate(@RequestParam income: Double): Map<String, Any> {
        val rate = taxRate(income)
        return mapOf(
            "income" to income,
            "taxRate" to rate
        )
    }


private fun taxRate(I: Double): Double {
    return when {
        I <= 10000 -> 0.0
        I > 277825 -> 45.0
        else -> min(42.0, 14.51 * ln(I / 8841.55) - 3.71)
    }
}

}


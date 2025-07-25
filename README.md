# 🧾 Tax Rate API

A simple Kotlin Spring Boot REST API that roughly calculates the tax rate based on a given income using a logarithmic formula.

---

## Get Started

Generate Gradle Wrapper (if not present)
```bash
gradle wrapper 
chmod +x ./gradlew
./gradlew bootRun
```

---

## Endpoint 

- RESTful endpoint: `/tax-rate?income=...`

---

## 📐 Simplified Tax Calculation Formula

```kotlin
fun taxRate(I: Double): Double {
    return when {
        I <= 10000 -> 0.0
        I > 277825 -> 45.0
        else -> min(42.0, 15.5 * ln(I / 12000) + 8.5)
    }
}


# 🧾 Tax Rate API

A simple Kotlin Spring Boot REST API that roughly calculates the tax rate based on a given income using a logarithmic formula.

---

## Get Started

Generate Gradle Wrapper (if not present)
```bash
gradle wrapper --gradle-version 8.7
chmod +x ./gradlew
./gradlew bootRun
```

---

## 🚀 Features

- RESTful endpoint: `/tax-rate?income=...`
- Kotlin + Spring Boot 3.x
- Gradle build
- Lightweight and easy to run

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


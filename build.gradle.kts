plugins {
    kotlin("multiplatform") version "2.1.0"
}

repositories {
    mavenCentral()
}

kotlin {
    wasmWasi {
        binaries.executable()
        nodejs()
    }
    sourceSets {
        val wasmWasiMain by getting
    }
}

tasks.register("runWasm") {
    group = "application"
    description = "Builds and runs the WASI binary"
    dependsOn("wasmWasiNodeProductionRun")
}
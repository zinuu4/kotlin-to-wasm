Due to limitations of Kotlin/Wasm (WASI), standard input (readln/Scanner) is not fully supported, so input is simulated.


fun main() {
  while (true) {
    val line = readlnOrNull() ?: break
    println("Wasm received: $line")
  }
}

This code gives the following error:

> Task :wasmWasiNodeProductionRun FAILED

node:internal/modules/run_main:125
triggerUncaughtException(
^
Exception [WebAssembly.Exception] {}

Node.js v22.0.0

FAILURE: Build failed with an exception.

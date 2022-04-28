package com.bitvavo.crypto.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaStreamsCryptoPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<KafkaStreamsCryptoPlaygroundApplication>(*args)
}

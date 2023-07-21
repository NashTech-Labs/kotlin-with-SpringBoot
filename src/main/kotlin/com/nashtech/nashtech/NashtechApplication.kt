package com.nashtech.nashtech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.nashtech.nashtech")
class KotlinSpringBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}

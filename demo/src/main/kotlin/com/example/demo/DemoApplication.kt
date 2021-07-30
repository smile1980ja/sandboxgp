package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.stereotype.Component
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments

@SpringBootApplication
class DemoApplication 
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


@Component
class DemoApplicationRunner: ApplicationRunner {
	override fun run(args: ApplicationArguments) {
		println("Hello, Spring!");	
	}	
}

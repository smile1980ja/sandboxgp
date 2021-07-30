package com.example.demo

import org.springframework.data.annotation.Id
//import org.springframework.data.annotation.PersistenceConstructor

import org.springframework.data.repository.CrudRepository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.stereotype.Component
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments
//import org.springframework.beans.factory.annotation.Autowired

data class Member(@Id val id: String, val name: String = "unset") 

interface MemberRepository : CrudRepository<Member, String> 

@SpringBootApplication
class DemoApplication 
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@Component
class DemoApplicationRunner(val repository : MemberRepository): ApplicationRunner {

	override fun run(args: ApplicationArguments) {
		val count = repository.count()
		println("the count is ${count}")
	}	
}
package com.example.demo

import org.springframework.data.annotation.Id
//import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.relational.core.mapping.MappedCollection

import org.springframework.data.repository.CrudRepository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.stereotype.Component
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments

data class Attr (@Id val attrId: String, val attrName: String)
data class Member(@Id val id: String, val name: String = "unset", @MappedCollection(idColumn = "ATTR_ID") val attrs: Set<Attr>) 

interface MemberRepository : CrudRepository<Member, String> 

//data class Name(val name: String)

//interface NameRepository : CrudRepository<Name, String> {
//   fun getLength(name: String): Long 
//}

@SpringBootApplication
class FstApplication 
fun main(args: Array<String>) {
	runApplication<FstApplication>(*args)
}

@Component
// repository can change for purpose
class FstApplicationRunner(val repository : MemberRepository): ApplicationRunner {

	override fun run(args: ApplicationArguments) {
		// one2many
		//val member = repository.findById("1")
		//println("${member.toString()}")

		// named query
		//repository.getLength

		
	}	
}
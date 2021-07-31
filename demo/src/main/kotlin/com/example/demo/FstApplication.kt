package com.example.demo

import org.springframework.data.annotation.Id
//import org.springframework.data.annotation.PersistenceConstructor
//import org.springframework.data.relational.core.mapping.MappedCollection

import org.springframework.data.repository.CrudRepository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.stereotype.Component
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments

//for testing one2many
//data class Attr (@Id val attrId: String, val attrName: String)
//data class Member(@Id val id: String, val name: String = "unset", @MappedCollection(idColumn = "ATTR_ID") val attrs: Set<Attr>) 
// if need to create, id should be nullable
data class Member(@Id val id: String?, val name: String = "unset")

interface MemberRepository : CrudRepository<Member, String> 

// for testing named query
data class Name(val name: String, val attrName: String)
interface NameRepository : CrudRepository<Name, String> {
   fun getAttrsByName(name: String): List<Name> 
}

@SpringBootApplication
class FstApplication 
fun main(args: Array<String>) {
	runApplication<FstApplication>(*args)
}

@Component
// repository can change for purpose
class FstApplicationRunner(val repository : NameRepository): ApplicationRunner {
//class FstApplicationRunner(val repository : MemberRepository): ApplicationRunner {
	override fun run(args: ApplicationArguments) {
		// one2many
		//val member = repository.findById("1")
		//println("${member.toString()}")

		// named query
		for (row in repository.getAttrsByName("kenta")) println(row.toString())

		// insert
		//val member = Member(null, "rie")
		//repository.save(member)

		//for (row in repository.findAll()) println(row.toString())
	}	
}
package com.example.demo.repository

import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository

/**
 *
 */
data class Member(@Id val id: String?, val name: String = "unset")

/**
 *
 */
interface MemberRepository : CrudRepository<Member, String> 

//val member = Member(null, "rie")
//repository.save(member)

//for one2many
//import org.springframework.data.relational.core.mapping
/**
 *
 */
//data class Attr (@Id val attrId: String, val attrName: String)

/**
 *
 */
//data class Member(@Id val id: String, val name: String = "unset", @MappedCollection(idColumn = "ATTR_ID") val attrs: Set<Attr>) 
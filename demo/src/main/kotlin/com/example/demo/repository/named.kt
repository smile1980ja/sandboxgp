package com.example.demo.repository

import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository

/**
 * 
 */
data class Name(val name: String, val attrName: String)

/**
 * 
 */
interface NameRepository : CrudRepository<Name, String> {
   /***
    * @args atg
    * @return return
    */
   fun getAttrsByName(name: String): List<Name> 
}

//for (row in repository.getAttrsByName("kenta")) println(row.toString())
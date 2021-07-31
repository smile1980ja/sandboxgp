package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.context.annotation.Configuration
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.context.annotation.Bean
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step

import com.example.demo.controller.FstTasklet

/**
 *
 */
@SpringBootApplication
class FstApplication 
fun main(args: Array<String>) {
	runApplication<FstApplication>(*args)
}

/**
 *
 */
@EnableBatchProcessing
@Configuration
public class BatchConfig (
	val jobBuilderFactory: JobBuilderFactory,
	 val stepBuilderFactory: StepBuilderFactory,
	 val fstTasklet: FstTasklet) {
 
	/**
	 *
	 */ 
    @Bean
	fun fstJob(fstStep: Step): Job {
        return jobBuilderFactory.get("fstJob") //Job名を指定
                .flow(fstStep) //実行するStepを指定
                .end()
                .build()
    }

	/**
	 *
	 */ 
	@Bean
    fun fstStep():Step {
        return stepBuilderFactory.get("fstStep") //Step名を指定
                .tasklet(fstTasklet) //実行するTaskletを指定
                .build()
	}
}
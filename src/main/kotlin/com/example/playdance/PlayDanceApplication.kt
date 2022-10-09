package com.example.playdance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class PlayDanceApplication

fun main(args: Array<String>) {
    runApplication<PlayDanceApplication>(*args)
}

package com.example.playdance.control

import com.example.playdance.model.data.ProfileRequest
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class MainControl {

    @GetMapping("/sayHello")
    fun sayHello(): String {
        return "Hello world and get off to sleep"
    }

    @PostMapping("/postHello")
    @ResponseStatus(HttpStatus.CREATED)
    fun getHello(@RequestBody request: ProfileRequest): String {
        return "Hello, ${request.name} ${request.secondName}.\n I know that you are ${request.age} old"
    }
}
package com.example.chapter7topic1

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class RegisterTest {

    lateinit var regis:Register

    @Before
    fun setUp() {
        regis = Register()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun validateRegisInput() {

    }
    @Test
    fun usernameEmpty(){
        val result = regis.validateRegistrationInput("", "a@b.com", "abc", "abc")
        assertEquals("pass empty", result, false)
    }
    @Test
    fun emailEmpty(){
        val result = regis.validateRegistrationInput("gyu", "", "abc", "abc")
        assertEquals("pass empty", result, true)
    }
    @Test
    fun passEmpty(){
        val result = regis.validateRegistrationInput("gyu", "a@b.com", "", "abc")
        assertEquals("email empty", result, true)
    }
    @Test
    fun confpassEmpty(){
        val result = regis.validateRegistrationInput("gyu", "a@b.com", "abc", "")
        assertEquals("pass empty", result, true)
    }
    @Test
    fun passNotMatch(){
        val result = regis.validateRegistrationInput("gyu", "a@b.com", "abc", "bcd")
        assertEquals("pass empty", result, true)
    }
    @Test
    fun usernameInData(){
        val result = regis.validateRegistrationInput("gyu", "a@b.com", "", "")
        assertEquals("pass empty", result, true)
    }
}
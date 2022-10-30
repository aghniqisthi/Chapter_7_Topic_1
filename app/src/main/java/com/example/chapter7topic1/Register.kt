package com.example.chapter7topic1

class Register {
    private val dataUsername = listOf("Cheol", "Han", "Soo", "Jun", "Hoshi", "Wonu", "Uji")

    fun validateRegistrationInput(username: String, email:String, password: String, confirmedPassword: String): Boolean {
        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (username in dataUsername){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count {it.isDigit()} < 6){
            return false
        }
        if (password.count {it.isDigit()} > 50){
            return false
        }
        return true
    }

}
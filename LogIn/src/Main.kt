const val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?=\\S+$).{4,}$"

fun username(): String {
    val name = readln()
    if (name.length < 5) {
        println("Bitte geben Sie einen Namen an.")
        return username()
    }
        println("Erfolgreich eingegeben")
    return name
}

fun password(): String {
    val inputPassword = System.console()?.readPassword() ?: readln()
    val pattern = PASSWORD_PATTERN.toPattern()
    val matcher = pattern.matcher(inputPassword.toString())
    if (!matcher.matches()) {
        println("Das Passwort ist zu kurz, es sollten mindestens 8 Zeichen lang sein.")
        return password()
    }
    println("Passwort wurde erfolgreich eingegeben")
    return inputPassword.toString()
}


fun main() {
    println("Bitte geben Sie Ihren Namen ein")
    username()
    println("Bitte geben Sie Ihr Passwort ein, dieses sollte mindestens 8 Zeichen beinhalten")
    password()
}
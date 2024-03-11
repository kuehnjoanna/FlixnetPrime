
fun main() {
    requestLogin()
    val videothek = Videothek()
    videothek.add(filme)
    videothek.add(Film("Dangerous Minds", "Drama", 12, listOf(4.1)))
    println(videothek)
    println(videothek.serien)
    videothek.add( Serie("Baywatch", "Komödie", 12, listOf(2.0), 24, 8))
    println()
    println(videothek.filme.joinToString("\n"))
    println()
    println(videothek.serien.joinToString("\n"))

}

val filme: List<Film> = listOf(
    Film("The Rock", "Action", 18, listOf(1.2)),
    Film("Das letzte Einhorn", "Fantasy", 0, listOf(4.8)),
    Film("Cranck", "Action", 18, listOf(3.4)),
    Film("Paw Patrol", "Animation", 0, listOf(4.5)),
    Serie("Sense 8", "SciFi", 18, listOf(5.0), 24, 8)
)

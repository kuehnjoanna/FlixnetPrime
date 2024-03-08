fun main() {
    requestLogin()
    val videothek = Videothek()
    videothek.add(filme)
    videothek.add(Film("Dangerous Minds", "Drama", 12, listOf(1.2)))
    println(videothek)
    println(videothek.serien)
    videothek.add( Serie("Baywatch", "Komödie", 12, listOf(1.2), 2, 24))
    println()
    println(videothek.filme.joinToString("\n"))
    println()
    println(videothek.serien.joinToString("\n"))
    println(videothek.highestRating(5).joinToString("\n"))

}

val filme: List<Film> = listOf(
    Film("The Rock", "Action", 18, listOf(3.0)),
    Film("Das letzte Einhorn", "Fantasy", 0, listOf(4.2)),
    Film("Cranck", "Action", 18, listOf(5.0)),
    Film("Paw Patrol", "Animation", 0, listOf(1.0)),
    Serie("Sense 8", "SciFi", 18, listOf(2.0), 2, 24)
)

fun main() {
    requestLogin()
    val videothek = Videothek()
    videothek.add(filme)
    videothek.add(Film("Dangerous Minds", "Drama", 12))
    println(videothek)
    println(videothek.serien)
    videothek.add( Serie("Baywatch", "Komödie", 12, 2, 24))
    println(videothek.filme)
    println(videothek.serien)
}


val filme: List<Film> = listOf(
    Film("The Rock", "Action", 18),
    Film("Das letzte Einhorn", "Fantasy", 0),
    Film("Cranck", "Action", 18),
    Film("Paw Patrol", "Animation", 0),
    Serie("Sense 8", "SciFi", 18, 2, 24)
)

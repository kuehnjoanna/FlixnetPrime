class Videothek() {
    private val filmeUndSerien = mutableListOf<Film>()
    val serien
        get() = filmeUndSerien.filter { film: Film -> film is Serie }
    val filme
        get() = filmeUndSerien.filter { film: Film -> film !is Serie }
    fun add(item: Film) {
        filmeUndSerien.add(item)
    }

    fun add(items: Collection<Film>) {
        filmeUndSerien.addAll(items)
    }

    fun highestRating(): Collection<Film> {
        val sortedByRating =  filmeUndSerien.sortedBy { film ->  film.rating.average() }
        return sortedByRating.slice(1..3 )
    }
    fun randomSelection(): Film {
        var eingabe = readln()
        when(eingabe) {
            "1" -> {
                return serien.random()
            }
            "2" -> {
                return filme.random()
            }
            "3" -> {
                return filmeUndSerien.random()
            }
        }
        println("Falsche Eingabe bitte versuchen Sie es erneut!")
        return randomSelection()
    }

    override fun toString(): String {
        return filmeUndSerien.joinToString("\n")
    }
}

open class Film(val name: String, val genre: String, val usk: Int, val rating: List<Double>) {
    override fun toString(): String {
        return "$name, Genre: $genre, USK: $usk, rating: ${rating.average()}"
    }
}

class Serie(name: String, genre: String, usk: Int, rating: List<Double>, val staffeln: Int, val folgen: Int) : Film(name, genre, usk, rating) {
    override fun toString(): String {
        return "${super.toString()}, Staffeln: $staffeln, Folgen: $folgen"
    }
}




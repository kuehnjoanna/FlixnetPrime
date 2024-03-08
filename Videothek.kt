class Videothek() {
    private val listen = mutableListOf<Film>()
    fun add(item: Film) {
        listen.add(item)
    }

    fun add(items: Collection<Film>) {
        listen.addAll(items)
    }

    override fun toString(): String {
        return listen.joinToString("\n")
    }
}

open class Film(val name: String, val genre: String, val usk: Int) {
    override fun toString(): String {
        return "$name, Genre: $genre, USK: $usk"
    }
}

class Serie(name: String, genre: String, usk: Int, val staffeln: Int, val folgen: Int) : Film(name, genre, usk) {
    override fun toString(): String {
        return "${super.toString()}, Staffeln: $staffeln, Folgen: $folgen"
    }
}



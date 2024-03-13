package src

fun main (){
//abo moglichkeit anzeigen(abhangig von rest ob wir es mit readln machen oder halt nicht)
    aboOptions()
}

fun aboOptions (){
// hab gedacht an extra map fur mehr info uber jeder abo, aber mir ist nichts an mehr info eingefallen
    val singleAbo = "ein account, viel spass"
    val familyAbo = "bis zu drei Profile"
    val premiumAbo = "bis auf sechs Profile!"

    val options = mutableMapOf(
        singleAbo to 5.99,
        familyAbo to 10.99,
        premiumAbo to 19.99)

    println("Abo Options:")

    for ((key, value) in options) {
        println("$key - $value")
    }

    println("Mochtest du Abo haben? \n(Ja/Nein)")
    val getJaOderNein = readLine()?.lowercase()
    when (getJaOderNein) {
        "ja" -> kaufAbwicklung(options)
        "nein" -> println("Alles klar, vielleicht ein anderes Mal :).")
        else -> println("Falsche Angabe")
    }
}

fun kaufAbwicklung (options: Map<String, Double>){
    println("Welche Abo interessiert dich?")
    println("1. Single      2. Family       3. Premium")
    val aboAuswahl = readln().toIntOrNull()

    if (aboAuswahl != null && aboAuswahl in 1..options.size) {
        val selectedAbo = options.entries.elementAt(aboAuswahl - 1)
        val aboName = selectedAbo.key
        val aboPreis = selectedAbo.value

        println("Du hast das $aboName ausgewählt, der Preis ist $aboPreis Euro.")

        println("Möchtest du fortsetzen? (Ja/Nein)")
        val weiterKaufen = readln().lowercase()
        when (weiterKaufen) {
            "ja" -> {
                println("Bearbeitung des Kaufs...")
                Thread.sleep(1000L)
                println("Kauf abgeschlossen! Viel Spass beim gucken!")
            }
            "nein" -> println("Der Kauf wurde abgebrochen.")
            else -> println("Falsche Angabe")
        }
    } else {
        println("Ungültige Auswahl.")
    }
}


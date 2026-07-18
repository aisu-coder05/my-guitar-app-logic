fun main() {
    // val cannot be changed (LOCKED)
    val songName: String = "Perfect" 
    
    // var CAN be changed (OPEN)
    var currentChord: String = "G Major"
    println("Playing Song: $songName")
    println("Started with Chord: $currentChord")
    
    // Changing the chord from G Major to C Major
    currentChord = "C Major" 
    println("Next Chord changed to: $currentChord")
}


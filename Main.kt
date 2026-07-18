fun main() {
    println("--- Guitar App Started ---")
    
    // Calling our custom function/switch
    playChordSound("G Major")
    playChordSound("C Major")
}

// This is our custom function (The Magic Button)
fun playChordSound(chordName: String) {
    println("🎵 Playing the beautiful sound of: $chordName")
}

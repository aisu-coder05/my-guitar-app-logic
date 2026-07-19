
fun main() {
    println("--- Smart Guitar App ---")
    
    // Testing our smart switch
    playChordSound("G Major")
    playChordSound("C Major")
    playChordSound("F Major") // Let's see what happens here!
}

// Our custom function with If-Else logic
fun playChordSound(chordName: String) {
    if (chordName == "G Major") {
        println("🔊 Playing G Major Sound: Tinggg! 🎸")
    } else if (chordName == "C Major") {
        println("🔊 Playing C Major Sound: Tanggg! 🎸")
    } else {
        println("❌ Audio for $chordName is not added yet!")
    }
}

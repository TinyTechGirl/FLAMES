data class Flashcard(val question: String, val answer: String)

class MainActivity : AppCompatActivity() {

    private val flashcards = listOf(
        Flashcard("What's one thing you appreciate most about me?", "Their answer will show you what they value in you."),
        // Add 9 more flashcards here...
    )

    // ... rest of your activity code
}


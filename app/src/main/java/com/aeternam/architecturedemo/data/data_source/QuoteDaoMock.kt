package com.aeternam.architecturedemo.data.data_source

import com.aeternam.architecturedemo.domain.model.Quote

class QuoteDaoMock : QuoteDao {

    private val quotes = listOf(
        Quote("Theodore Roosevelt", "Believe you can and you're halfway there", 0xFFFFCDD2.toInt()),
        Quote("Eleanor Roosevelt", "Do one thing every day that scares you", 0xFFC5CAE9.toInt()),
        Quote("Franklin D. Roosevelt", "The only thing we have to fear is fear itself", 0xFFF8BBD0.toInt()),
        Quote("Pablo Picasso", "Everything you can imagine is real", 0xFFB2EBF2.toInt()),
        Quote("Arthur Ashe", "Start where you are. Use what you have. Do what you can", 0xFFDCEDC8.toInt()),
        Quote("Winston Churchill", "Success is not final, failure is not fatal: It is the courage to continue that counts", 0xFFFFE0B2.toInt()),
        Quote("Steve Jobs", "Your time is limited, so don’t waste it living someone else’s life", 0xFFD1C4E9.toInt()),
        Quote("Marcus Aurelius", "You have power over your mind—not outside events. Realize this, and you will find strength", 0xFFFFF9C4.toInt()),
        Quote("Albert Einstein", "Life is like riding a bicycle. To keep your balance you must keep moving", 0xFFC8E6C9.toInt()),
        Quote("Ralph Waldo Emerson", "Do not go where the path may lead, go instead where there is no path and leave a trail", 0xFFFFCCBC.toInt()),
        Quote("Dr. Seuss", "Don’t cry because it’s over, smile because it happened", 0xFFA5D6A7.toInt()),
        Quote("Lao Tzu", "A journey of a thousand miles begins with a single step", 0xFF80CBC4.toInt()),
        Quote("Confucius", "It does not matter how slowly you go as long as you do not stop", 0xFFFFF176.toInt()),
        Quote("Nelson Mandela", "It always seems impossible until it's done", 0xFFE1BEE7.toInt()),
        Quote("Helen Keller", "Keep your face to the sunshine and you cannot see a shadow", 0xFFB39DDB.toInt()),
        Quote("George Eliot", "It is never too late to be what you might have been", 0xFFFFAB91.toInt()),
        Quote("John Wooden", "Don’t let what you cannot do interfere with what you can do", 0xFF90CAF9.toInt()),
        Quote("Steve Jobs", "Stay hungry, stay foolish", 0xFFCE93D8.toInt()),
        Quote("Henry Ford", "Whether you think you can or you think you can't, you're right", 0xFFAED581.toInt()),
        Quote("Oscar Wilde", "Be yourself; everyone else is already taken", 0xFFFFF59D.toInt()),
        Quote("Aristotle", "We are what we repeatedly do. Excellence, then, is not an act, but a habit", 0xFFFFD54F.toInt()),
        Quote("Bruce Lee", "Knowing is not enough, we must apply. Willing is not enough, we must do", 0xFF4DB6AC.toInt()),
        Quote("Abraham Lincoln", "Whatever you are, be a good one", 0xFFFF8A65.toInt()),
        Quote("Socrates", "The unexamined life is not worth living", 0xFFE0F7FA.toInt()),
        Quote("Alan Watts", "The only way to make sense out of change is to plunge into it, move with it, and join the dance", 0xFFDCE775.toInt()),
        Quote("Charles Bukowski", "Find what you love and let it kill you", 0xFFFFCDD2.toInt()),
        Quote("Carl Jung", "Who looks outside, dreams; who looks inside, awakes", 0xFFB0BEC5.toInt()),
        Quote("Seneca", "Luck is what happens when preparation meets opportunity", 0xFFFFF176.toInt())
    )
    override fun getRandomQuote(): Quote {
        return quotes.random()
    }
}
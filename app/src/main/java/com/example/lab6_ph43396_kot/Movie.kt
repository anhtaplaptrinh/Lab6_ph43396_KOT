package com.example.lab6_ph43396_kot


data class Movie(
    val title: String,
    val duration: String,
    val posterUrl: String,
    val releaseDate: String,
    val genre: String,
    val shortDescription: String,
    val year: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                "Liên Quân",
                "15 minutes",
                "https://i.pinimg.com/originals/b7/89/4e/b7894e9aaa18666b48ee223daaa6764e.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "120 phút"
            ),
            Movie(
                "Murad",
                "18 minutes",
                "https://i.pinimg.com/originals/4f/44/8b/4f448b50a00e51ae9a29e4d7082bb11e.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "98 phút"
            ),
            Movie(
                "Murad",
                "18 minutes",
                "https://i.pinimg.com/originals/0a/9f/c3/0a9fc37ccbc34eeeab7ede1d9774a5a3.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "110 phút"
            ),
            Movie(
                "Liên Quân",
                "15 minutes",
                "https://i.pinimg.com/originals/b7/89/4e/b7894e9aaa18666b48ee223daaa6764e.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "120 phút"
            ),
            Movie(
                "Murad",
                "18 minutes",
                "https://i.pinimg.com/originals/4f/44/8b/4f448b50a00e51ae9a29e4d7082bb11e.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "98 phút"
            ),
            Movie(
                "Murad",
                "18 minutes",
                "https://i.pinimg.com/originals/0a/9f/c3/0a9fc37ccbc34eeeab7ede1d9774a5a3.jpg",
                "2016",
                "GAME",
                "Liên Quân Mobile là một trò chơi MOBA (Multiplayer Online Battle Arena) nổi tiếng do Garena phát triển, phát hành trên nền tảng di động từ năm 2016. Trò chơi thu hút hàng triệu người chơi nhờ lối chơi hấp dẫn và chiến thuật sâu sắc.",
                "110 phút"
            )

        )
    }
}
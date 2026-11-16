package com.nwhite.book.recomendation;

public record BookRecommendation(
        String title,
        String author,
        int publicationYear,
        String genre,
        int pageCount,
        String summary
) {
}

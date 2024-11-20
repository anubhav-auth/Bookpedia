package com.anubhavauth.bookpedia.book.presentation.book_detail

import com.anubhavauth.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)

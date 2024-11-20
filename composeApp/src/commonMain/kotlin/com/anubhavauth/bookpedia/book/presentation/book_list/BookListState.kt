package com.anubhavauth.bookpedia.book.presentation.book_list

import com.anubhavauth.bookpedia.book.domain.Book
import com.anubhavauth.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
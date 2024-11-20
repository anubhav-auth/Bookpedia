package com.anubhavauth.bookpedia.book.data.network

import com.anubhavauth.bookpedia.book.data.dto.BookWorkDto
import com.anubhavauth.bookpedia.book.data.dto.SearchResponseDto
import com.anubhavauth.bookpedia.core.domain.DataError
import com.anubhavauth.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}
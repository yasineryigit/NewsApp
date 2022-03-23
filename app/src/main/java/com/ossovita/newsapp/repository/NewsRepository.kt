package com.ossovita.newsapp.repository

import com.ossovita.newsapp.api.RetrofitInstance
import com.ossovita.newsapp.db.ArticleDatabase
import com.ossovita.newsapp.model.Article

class NewsRepository(
    val db: ArticleDatabase
) {

    //takes parameteres of countryCode and pageNumber then make https request to the api
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)


}
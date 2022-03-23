package com.ossovita.newsapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ossovita.newsapp.repository.NewsRepository

class NewsModelProviderFactory(
    val app: Application,
    val newsRepository: NewsRepository

) : ViewModelProvider.Factory {
    //view model döndürür
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}
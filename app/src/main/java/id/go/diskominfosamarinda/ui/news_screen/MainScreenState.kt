package id.go.diskominfosamarinda.ui.news_screen

import com.alieflab.core.domain.model.News
import com.alieflab.core.domain.model.NewsDetail

data class MainScreenState(
    val data: List<NewsDetail?> = emptyList(),
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val error: String = ""
)
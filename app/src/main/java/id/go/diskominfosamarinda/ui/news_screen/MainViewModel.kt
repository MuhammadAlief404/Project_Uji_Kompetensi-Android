package id.go.diskominfosamarinda.ui.news_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alieflab.core.domain.usecase.ContentUseCase
import com.alieflab.core.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val contentUseCase: ContentUseCase
) : ViewModel() {

    var state by mutableStateOf(MainScreenState())

    init {
        getContent()
    }

    private fun getContent() {
        viewModelScope.launch {
            val getContentList = async { contentUseCase.getContent() }

            when (val content = getContentList.await()) {
                is Resource.Success -> {
                    state = if (content.data.isNullOrEmpty()) {
                        state.copy(isEmpty = true)
                    } else {
                        state.copy(data = content.data)
                    }
                }

                is Resource.Error -> {
                    state = state.copy(error = content.message ?: "something went wrong")
                }

                is Resource.Loading -> {
                    state = state.copy(isLoading = true)
                }
            }
        }
    }
}
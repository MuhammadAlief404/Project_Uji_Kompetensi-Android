package id.go.diskominfosamarinda.ui.news_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.alieflab.core.domain.model.NewsDetail
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import id.go.diskominfosamarinda.BuildConfig

@RootNavGraph(start = true)
@Destination
@Composable
fun NewsAppScreen(
    navigator: DestinationsNavigator
) {
    Scaffold() { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .background(Color.Black)
        ) {
            NewsList()
        }
    }
}

@Composable
fun NewsList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(newsItems.size) { index ->
            NewsItemCard(newsItems[index])
        }
    }
}

@Composable
fun NewsItemCard(item: NewsDetail) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.DarkGray, shape = RoundedCornerShape(8.dp))
            .clickable { }
            .padding(12.dp)
    ) {
        Text(item.judul, color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(4.dp))
        Text(item.isi, color = Color.White, fontSize = 16.sp)
        item.foto.let {
            Spacer(Modifier.height(8.dp))
            AsyncImage(
                model =  it,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    }
}
package com.example.grid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grid.model.Topic
import com.example.grid.ui.theme.GridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GridApp()
        }
    }
}

@Composable
fun GridApp() {
    GridTheme {
        GridList(gridList = Datasource().loadGrid())
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridList(gridList: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(cells = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp)) {
        items(gridList) { grids ->
            Grid(grids)
        }
    }
}

@Composable
fun Grid(topic: Topic, modifier: Modifier = Modifier) {

    val pointsImage = painterResource(R.drawable.ic_grain)
    Card(shape = RectangleShape, modifier = Modifier.padding(8.dp)) {
        Row(modifier = Modifier.height(68.dp)) {
            Image(
                painter = painterResource(topic.imageResourceId),
                contentDescription = stringResource(topic.stringResourceId),
                modifier = Modifier.size(68.dp, 68.dp)


            )
            Column() {
                Text(
                    text = LocalContext.current.getString(topic.stringResourceId),
                    modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 8.dp),
                    fontSize = 13.sp
                )
                Row(modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 8.dp)) {
                    Icon(
                        painter = pointsImage,
                        contentDescription = stringResource(
                            topic.countTopicId
                        ),
                    )
                    Text(
                        text = LocalContext.current.getString(topic.countTopicId),
                        modifier = Modifier
                            .padding(8.dp, 0.dp, 0.dp, 0.dp)
                            .align(Alignment.CenterVertically),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Grid(Topic(R.string.photography, R.string.Int321, R.drawable.photography))
}
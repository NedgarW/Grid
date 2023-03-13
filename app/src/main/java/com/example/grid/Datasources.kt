package com.example.grid

import com.example.grid.R
import com.example.grid.model.Topic

class Datasource {
    fun loadGrid(): List<Topic> {
        return listOf<Topic>(
            Topic(R.string.architecture, R.string.Int58, R.drawable.architecture),
            Topic(R.string.crafts, R.string.Int121, R.drawable.crafts),
            Topic(R.string.business, R.string.Int78, R.drawable.business),
            Topic(R.string.culinary, R.string.Int118, R.drawable.culinary),
            Topic(R.string.design, R.string.Int423, R.drawable.design),
            Topic(R.string.fashion, R.string.Int92, R.drawable.fashion),
            Topic(R.string.film, R.string.Int165, R.drawable.film),
            Topic(R.string.gaming, R.string.Int164, R.drawable.gaming),
            Topic(R.string.drawing, R.string.Int326, R.drawable.drawing),
            Topic(R.string.lifestyle, R.string.Int305, R.drawable.lifestyle),
            Topic(R.string.music, R.string.Int212, R.drawable.music),
            Topic(R.string.painting, R.string.Int172, R.drawable.painting),
            Topic(R.string.photography, R.string.Int321, R.drawable.photography),
            Topic(R.string.tech, R.string.Int118, R.drawable.tech),
        )
    }
}
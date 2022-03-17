package com.corvodev.movies20221.server.moviesrepository

import com.corvodev.movies20221.server.MovieDB
import com.corvodev.movies20221.server.model.MoviesList

class MoviesRepository {

    private val apiKey = "55054cfe89b09a476d2609a10a253754"

    suspend fun getMovies(): MoviesList = MovieDB.retrofit.getTopRated(apiKey)

}
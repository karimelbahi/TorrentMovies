package com.mhmdawad.torrentmovies.data.source

import com.mhmdawad.torrentmovies.data.model.MovieDetails
import com.mhmdawad.torrentmovies.data.model.MoviesResponse

class NetworkResourceImpl(private val apiService: ApiService): INetworkResource {


    override suspend fun searchMovie(search: String, page: Int): MoviesResponse = apiService.searchInMovie(search, page)

    override suspend fun getMoviesCategory(category: String, page: Int): MoviesResponse
            = apiService.getMoviesCategoryList(category, page)

    override suspend fun movieDetails(id: Int): MovieDetails =
        apiService.getMovieDetails(id)

}
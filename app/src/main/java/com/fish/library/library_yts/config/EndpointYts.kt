package com.fish.library.library_yts.config

import com.fish.library.library_yts.ResponseDataTorrent
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Endpoint yts
 *
 * Interface de acesso aos Endpoints da API do site YTS
 */
internal interface EndpointYts {


    /**
     * Get list torrent movie by imdb code
     *
     * Efetua a busca de torrents pelo imdb code
     * @param imdb_code
     */
    @GET("list_movies.json")
    suspend fun getListTorrentMovieByImdbCode(
        @Query("query_term") imdb_code : String
    ) : Response<ResponseDataTorrent>


}
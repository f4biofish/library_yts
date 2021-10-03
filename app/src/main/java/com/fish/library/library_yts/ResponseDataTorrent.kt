package com.fish.library.library_yts

/**
 * Response data torrent
 *
 * Classe de resposta a solicitação de busca ao endpoint /list_movies.json
 */
data class ResponseDataTorrent(
    val data : ResponseMovies
)


data class ResponseMovies(
    val movie_count : Int,
    val limit : Int,
    val page_number : Int,
    val movies : List<MoviesYts>
)


data class MoviesYts(
    val id : Long,
    val imdb_code : String,
    val url : String,
    var torrents : List<Torrent>
)


data class Torrent(
    val url : String,
    val hash : String,
    val quality : String,
    val type : String,
    val seeds : Int,
    val peers : Int,
    val size : String,
    val size_bytes : Long,
    val date_uploaded : String,
    val date_uploaded_unix : Long
)

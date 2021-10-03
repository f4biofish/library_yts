package com.fish.library.library_yts

import com.fish.library.library_yts.config.EndpointYts
import com.fish.library.library_yts.config.RetrofitYtsConfig
import java.lang.Exception

/**
 * Repositorio yts
 *
 * Classe de acesso aos endpoints da API do site YTS
 */
class RepositorioYts {

    private val retrofit = RetrofitYtsConfig.getRetrofitInstance()
    private val endpoint = retrofit.create(EndpointYts::class.java)


    /**
     * Get torrents by imdb code
     *
     * Efetua a busca dos torrents no site YTS
     * @param imdb_code Código IMDB para a busca dos torrents
     * @return Retorna a lista de torrents encontrados ou null se nada localizado
     */
    suspend fun getTorrentsByImdbCode(imdb_code : String) : List<Torrent>? {

        return try {
            val response = endpoint.getListTorrentMovieByImdbCode(imdb_code)
            if (!response.isSuccessful) return null
            val dados = response.body()?.data ?: return null
            val movies = dados.movies
            if (movies.isEmpty()) return null
            return movies[0].torrents
        } catch (e : Exception){
            e.printStackTrace()
            null
        }

    }



}
package com.fish.library.library_yts.config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit yts config
 *
 * Classe de Criação da configuração do Retrofit para acesso a API do YTS
 */
internal class RetrofitYtsConfig {

    companion object {
        private const val LINK_BASE = "https://yts.mx/api/v2/"
        fun getRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl(LINK_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}
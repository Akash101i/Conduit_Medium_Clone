package io.realworld.api.services

import io.realworld.api.models.ArticlesResponse
import org.omg.CORBA.ARG_IN.value
import retrofit2.http.GET

interface ConduitAPI {

    @GET( value = "articles")
    fun getArticles(): ArticlesResponse
}
package io.realworld.api

import org.junit.Assert.assertNotNull
import org.junit.Test
import retrofit2.http.GET

class ConduitClientTest {

    private val conduitClient = ConduitClient()

    @Test
    fun 'GET articles'() {
        val articles = conduitClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}
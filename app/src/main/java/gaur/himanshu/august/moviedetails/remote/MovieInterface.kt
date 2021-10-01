package gaur.himanshu.august.moviedetails.remote

import gaur.himanshu.august.moviedetails.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieInterface {

   @GET("/")
   suspend fun getAllMovie(

      @Query("s")s:String,
      @Query("page")page:Int,
      @Query("apiKey")apiKey:String

   ):Response<MovieResponse>
}
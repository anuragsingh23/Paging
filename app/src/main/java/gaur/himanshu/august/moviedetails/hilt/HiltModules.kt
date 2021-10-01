package gaur.himanshu.august.moviedetails.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.august.moviedetails.remote.MovieInterface
import gaur.himanshu.august.moviedetails.utils.Constants
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit as Retrofit


@InstallIn(SingletonComponent::class)
@Module
object HiltModules {

    @Provides
    fun provideRetrofitInterface():MovieInterface{


        return Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(MovieInterface::class.java)

    }
}
package dev.archfoundry.marsphotosapp

import dev.archfoundry.marsphotosapp.data.NetworkMarsPhotosRepository
import dev.archfoundry.marsphotosapp.fake.FakeDataSource
import dev.archfoundry.marsphotosapp.fake.FakeMarsApiService
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest {
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}

package dev.archfoundry.marsphotosapp.fake

import dev.archfoundry.marsphotosapp.network.MarsApiService
import dev.archfoundry.marsphotosapp.network.MarsPhoto

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}

package dev.archfoundry.marsphotosapp

import dev.archfoundry.marsphotosapp.fake.FakeDataSource
import dev.archfoundry.marsphotosapp.fake.FakeNetworkMarsPhotosRepository
import dev.archfoundry.marsphotosapp.rules.TestDispatcherRule
import dev.archfoundry.marsphotosapp.ui.screen.MarsUiState
import dev.archfoundry.marsphotosapp.ui.screen.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        val marsViewModel = MarsViewModel(
            marsPhotosRepository = FakeNetworkMarsPhotosRepository()
        )
        assertEquals(
            MarsUiState.Success(FakeDataSource.photosList),
            marsViewModel.marsUiState
        )
    }
}

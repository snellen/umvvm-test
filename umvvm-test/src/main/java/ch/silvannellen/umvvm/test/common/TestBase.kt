package ch.silvannellen.umvvm.test.common

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before

/**
 * Use this class as base class for all unit tests of the umvvm use cases. It replaces the main dispatcher with a mocked version.
 */
open class TestBase {

    /**
     * This dispatcher replaces Dispatcher.Main. It exposes useful methods for testing, such
     * as the ability to forward time to skip past any delay() calls in the code.
     * See https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-test-coroutine-dispatcher/
     */
    protected val mockedMainDispatcher = TestCoroutineDispatcher()

    @Before
    fun mockMainDispatcher() {
        Dispatchers.setMain(mockedMainDispatcher)
    }

    @After
    fun resetMainDispatcher() {
        Dispatchers.resetMain()
    }

}
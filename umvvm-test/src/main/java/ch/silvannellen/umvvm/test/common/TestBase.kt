package ch.silvannellen.umvvm.test.common

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before

open class TestBase {
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
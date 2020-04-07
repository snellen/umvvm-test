package ch.silvannellen.umvvm.test.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import ch.silvannellen.umvvm.test.common.TestBase
import org.junit.Rule

/**
 * Use this class as base class for all unit tests of the umvvm view models. It contains a test rule
 * that removes the dependency of LiveData on the UI (main) thread.
 */
open class ViewModelTestBase : TestBase() {

    @Rule
    @JvmField
    val removeDependencyOnUiThreadForLiveData = InstantTaskExecutorRule()
}
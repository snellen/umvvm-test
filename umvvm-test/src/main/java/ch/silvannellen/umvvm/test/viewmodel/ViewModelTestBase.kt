package ch.silvannellen.umvvm.test.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import ch.silvannellen.umvvm.test.common.TestBase
import org.junit.Rule

open class ViewModelTestBase : TestBase() {

    @Rule
    @JvmField
    val removeDependencyOnUiThreadForLiveData = InstantTaskExecutorRule()
}
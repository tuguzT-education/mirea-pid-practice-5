package io.github.tuguzt.viewmodellivedatapractice

abstract class SingletonHolder<T> {
    protected abstract val constructor: () -> T
    val instance: T by lazy { constructor() }
}

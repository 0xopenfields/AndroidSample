package com.hogehgoe.ktlibrary

class KtLibrary constructor() {

    // region Companion object

    companion object {
        @JvmStatic
        var _staticTitle: String = ""

        @JvmField
        var staticField: String = ""

        @JvmStatic
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }

    // endregion

    // region Stored properties

    var _title: String? = null
        private set

    var _status: Int = 0

    // endregion

    // region Constructor

    constructor(title: String): this() {
        _title = title
    }

    // endregion
}
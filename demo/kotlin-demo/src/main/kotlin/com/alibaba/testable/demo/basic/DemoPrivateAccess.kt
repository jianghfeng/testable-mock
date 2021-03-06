package com.alibaba.testable.demo.basic

/**
 * 演示私有成员访问功能
 * Demonstrate private member access functionality
 */
class DemoPrivateAccess {

    /**
     * a private member field
     */
    private var count = 0

    /**
     * a constant field
     */
    val pi = 3.14

    /**
     * private member method
     */
    private fun privateFunc(list: List<String>, str: String, i: Int): String {
        return list.reduce { a: String, s: String -> a + s } + " + " + "$str + $i"
    }

    companion object {

        /**
         * a private static field
         */
        private var staticCount = 0

        /**
         * private static method
         */
        private fun privateStaticFunc(str: String, i: Int): String {
            return "$str + $i"
        }

        /**
         * private jvm static method
         */
        @JvmStatic private fun privateJvmStaticFunc(list: List<String>, str: String, i: Int): String {
            return list.reduce { a: String, s: String -> a + s } + " * " + "$str * $i"
        }
    }

}

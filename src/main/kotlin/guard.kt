@file:Suppress("unused")


/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 *
 * ```kotlin
 * val p1: String? = "hello"
 * val p2: String? = "world"
 *
 * val result = guard(p1, p2) { a1, a2 -> "$a1 $a2" }
 *
 * print(result) // prints [hello world]
 *
 * ```
 *
 */
inline fun <T1, T2, R> guard(
    p1: T1?,
    p2: T2?,
    condition: Boolean = true,
    block: (T1, T2) -> R?
): R? = if (p1 != null && p2 != null && condition)
    block(p1, p2)
else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    condition: Boolean = true,
    block: (T1, T2, T3) -> R
): R? = if (p1 != null && p2 != null && p3 != null && condition)
    block(p1, p2, p3)
else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null && condition)
        block(p1, p2, p3, p4)
    else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, T5, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    p5: T5?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4, T5) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null && condition)
        block(p1, p2, p3, p4, p5)
    else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, T5, T6, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    p5: T5?,
    p6: T6?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4, T5, T6) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null && p6 != null && condition)
        block(p1, p2, p3, p4, p5, p6)
    else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, T5, T6, T7, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    p5: T5?,
    p6: T6?,
    p7: T7?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4, T5, T6, T7) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null &&
        p5 != null && p6 != null && p7 != null && condition
    )
        block(p1, p2, p3, p4, p5, p6, p7)
    else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, T5, T6, T7, T8, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    p5: T5?,
    p6: T6?,
    p7: T7?,
    p8: T8?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4, T5, T6, T7, T8) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null &&
        p5 != null && p6 != null && p7 != null && p8 != null && condition
    )
        block(p1, p2, p3, p4, p5, p6, p7, p8)
    else null

/**
 * This function will return a value as per the mapper function @see [block]
 * if all the parameters supplied are non null and the condition is true
 *
 * @param condition this defaults to true
 * @param block a function that return a instance of a type if the condition is tr
 * @return instance of a type
 */
inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> guard(
    p1: T1?,
    p2: T2?,
    p3: T3?,
    p4: T4?,
    p5: T5?,
    p6: T6?,
    p7: T7?,
    p8: T8?,
    p9: T9?,
    condition: Boolean = true,
    block: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R
): R? =
    if (p1 != null && p2 != null && p3 != null && p4 != null &&
        p5 != null && p6 != null && p7 != null && p8 != null &&
        p9 != null && condition
    )
        block(p1, p2, p3, p4, p5, p6, p7, p8, p9)
    else null
package com.weal.component.base.util;


import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.weal.component.base.common.BaseMassageCode;
import com.weal.component.base.exception.WealException;

import java.util.Collection;
import java.util.List;


/**
*
* @author guogchao
* @createTime
*/
@Slf4j
public class BizAssert {

    private BizAssert() {
    }

    /**
     * Fails a test with the given message.
     *
     * @param message the identifying message for the {@link BocloudException} (<code>null</code>
     *                okay)
     * @
     * @see BocloudException
     */
    public static void fail(int code, String message) {
        throw new WealException(code, message);
    }

    public static void fail(BaseMassageCode baseMassageCode) {
        if (baseMassageCode != null) {
            throw new WealException(baseMassageCode.getCode(), baseMassageCode.getMsg());
        }
        fail();
    }

    /**
     * Fails a test with no message.
     *
     * @
     */
    public static void fail() {
        fail(-1, null);
    }

    /**
     * 断言条件为真。如果不是，它会抛出一个带有给定消息的异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param condition     被检查的条件
     * @
     */
    public static void assertTrue(BaseMassageCode exceptionCode, boolean condition) {
        if (!condition) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言条件为假。如果不是，它会抛出一个带有给定消息的异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param condition     被检查的条件
     * @
     */
    public static void assertFalse(BaseMassageCode exceptionCode, boolean condition) {
        assertTrue(exceptionCode, !condition);
    }


    private static boolean equalsRegardingNull(Object expected, Object actual) {
        return expected == null ? actual == null : isEquals(expected, actual);
    }

    private static boolean isEquals(Object expected, Object actual) {
        return expected.equals(actual);
    }


    /**
     * 断言2个对象不是相等的。如果相等则抛出异常
     * {@link BocloudException}。
     * 如果<code>unexpected</code> 和 <code>actual</code> 是 <code>null</code>,
     * 他们被认为是相等的。
     *
     * @param exceptionCode 错误码
     * @param unexpected    意想不到的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @
     */
    public static void assertNotEquals(BaseMassageCode exceptionCode, Object unexpected, Object actual) {
        if (equalsRegardingNull(unexpected, actual)) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个对象不是相等的。如果相等则抛出异常
     * {@link BocloudException}。
     *
     * @param exceptionCode 错误码
     * @param unexpected    意想不到的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @
     */
    public static void assertNotEquals(BaseMassageCode exceptionCode, long unexpected, long actual) {
        if (unexpected == actual) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个doubles类型的值，在误差范围内<b>不</b>是相等的。如果相等则抛出异常
     * {@link BocloudException}。
     * <p>
     * 如果<code>unexpected</code>值为无穷大，则忽略<code>delta</code>值。
     * NaN被认为是相等的:
     *
     * @param exceptionCode 错误码
     * @param unexpected    意想不到的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @param delta         误差范围内
     * @
     */
    public static void assertNotEquals(BaseMassageCode exceptionCode, double unexpected,
                                       double actual, double delta) {
        if (!doubleIsDifferent(unexpected, actual, delta)) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个 float 类型的值，在误差范围内<b>不</b>是相等的。如果相等则抛出异常
     * {@link BocloudException}。
     * <p>
     * 如果<code>unexpected</code>值为无穷大，则忽略<code>delta</code>值。
     * NaN被认为是相等的:
     *
     * @param exceptionCode 错误码
     * @param unexpected    意想不到的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @param delta         误差范围内
     * @
     */
    public static void assertNotEquals(BaseMassageCode exceptionCode, float unexpected,
                                       float actual, float delta) {
        if (!floatIsDifferent(unexpected, actual, delta)) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个doubles类型的值，在误差范围内是相等的。如果不相等则抛出异常
     * {@link BocloudException}。
     * <p>
     * 如果<code>unexpected</code>值为无穷大，则忽略<code>delta</code>值。
     * NaN被认为是相等的:
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @param delta         误差范围内
     * @
     */
    public static void assertEquals(BaseMassageCode exceptionCode, double expected,
                                    double actual, double delta) {
        if (doubleIsDifferent(expected, actual, delta)) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个float类型的值，在误差范围内是相等的。如果不相等则抛出异常
     * {@link BocloudException}。
     * <p>
     * 如果<code>unexpected</code>值为无穷大，则忽略<code>delta</code>值。
     * NaN被认为是相等的:
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        要检查的值 <code>unexpected</code>
     * @param delta         误差范围内
     * @
     */
    public static void assertEquals(BaseMassageCode exceptionCode, float expected,
                                    float actual, float delta) {
        if (floatIsDifferent(expected, actual, delta)) {
            fail(exceptionCode);
        }
    }


    private static boolean doubleIsDifferent(double d1, double d2, double delta) {
        if (Double.compare(d1, d2) == 0) {
            return false;
        }
        if ((Math.abs(d1 - d2) <= delta)) {
            return false;
        }

        return true;
    }

    private static boolean floatIsDifferent(float f1, float f2, float delta) {
        if (Float.compare(f1, f2) == 0) {
            return false;
        }
        if ((Math.abs(f1 - f2) <= delta)) {
            return false;
        }
        return true;
    }


    /**
     * 断言2个long类型的值 是相等的。如果不相等则抛出异常
     * {@link BocloudException}。
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        要检查的值 <code>expected</code>
     * @
     */
    public static void assertEquals(BaseMassageCode exceptionCode, long expected, long actual) {
        if (expected != actual) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个int类型的值 是相等的。如果不相等则抛出异常
     * {@link BocloudException}。
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        要检查的值 <code>expected</code>
     * @
     */
    public static void assertInEquals(BaseMassageCode exceptionCode, int expected, int actual) {
        if (expected != actual) {
            fail(exceptionCode);
        }
    }


    /**
     * 断言检查这个对象不是 Null。 如果是null，用给定的错误码<code>exceptionCode</code>抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param object        检查对象
     * @
     */
    public static void assertNotNull(BaseMassageCode exceptionCode, Object object) {
        assertTrue(exceptionCode, object != null);
    }


    /**
     * 断言检查这个对象是 Null。 如果不是null，用给定的错误码<code>exceptionCode</code>抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param object        检查对象
     * @
     */
    public static void assertNull(BaseMassageCode exceptionCode, Object object) {
        if (object == null) {
            return;
        }
        fail(exceptionCode);
    }


    /**
     * 断言两个对象引用同一个对象. 如果不同，用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param expected      期望的对象
     * @param actual        需要比较的对象 <code>expected</code>
     * @
     */
    public static void assertSame(BaseMassageCode exceptionCode, Object expected, Object actual) {
        if (expected == actual) {
            return;
        }
        fail(exceptionCode);
    }

    /**
     * 断言两个对象不是引用同一个对象. 如果相同，用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param unexpected    意外的对象
     * @param actual        需要比较的对象 <code>expected</code>
     * @
     */
    public static void assertNotSame(BaseMassageCode exceptionCode, Object unexpected, Object actual) {
        if (unexpected == actual) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言集合不为空，如果为null或者empty，用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param collection    集合
     * @
     */
    public static void assertNotEmpty(BaseMassageCode exceptionCode, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言字符串不为空，如果为null或者empty，用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param value         字符串
     * @
     */
    public static void assertNotEmpty(BaseMassageCode exceptionCode, String value) {
        if (value == null || value.isEmpty()) {
            fail(exceptionCode);
        }
    }

    /**
     * 断言2个字符串是否相等，如果不等用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        需要比较的字符串<code>expected</code>
     * @
     */
    public static void assertEquals(BaseMassageCode exceptionCode, String expected, String actual) {
        if (expected == null && actual == null) {
            return;
        }
        if (expected != null && expected.equals(actual)) {
            return;
        }
        fail(exceptionCode);
    }

    /**
     * 断言2个字符串是否相等，如果不等用指定错误码抛出异常
     * {@link BocloudException}
     *
     * @param exceptionCode 错误码
     * @param expected      预期的值
     * @param actual        需要比较的字符串<code>expected</code>
     * @
     */
    public static void assertEqualsLoginVerification(BaseMassageCode exceptionCode, String expected, String actual) {
        if (expected == null && actual == null) {
            return;
        }
        if (expected != null && expected.equals(actual)) {
            return;
        }

        fail(exceptionCode);
    }

    public static void paramValidation(BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error : errors) {
                //log.error("================>>{}", error.getDefaultMessage());
                throw new WealException(60000, error.getDefaultMessage());
            }
        }
    }
}

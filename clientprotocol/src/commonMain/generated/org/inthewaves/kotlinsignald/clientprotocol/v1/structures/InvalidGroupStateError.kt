// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("InvalidGroupStateError")
public data class InvalidGroupStateError(
    public val message: String? = null
) : TypedExceptionV1

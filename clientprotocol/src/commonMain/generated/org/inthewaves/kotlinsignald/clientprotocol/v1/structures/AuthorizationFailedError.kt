// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * indicates the server rejected our credentials. Typically means the linked device was removed by
 * the primary device, or that the account was re-registered
 */
@Serializable
@SerialName("AuthorizationFailedError")
public data class AuthorizationFailedError(
    public override val message: String? = null
) : TypedExceptionV1()

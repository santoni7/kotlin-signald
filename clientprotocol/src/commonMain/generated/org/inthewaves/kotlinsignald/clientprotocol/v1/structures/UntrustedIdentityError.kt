// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class UntrustedIdentityError(
    public val identifier: String? = null,
    public val message: String? = null,
    @SerialName("identity_key")
    public val identityKey: IdentityKey? = null
) : TypedExceptionV1

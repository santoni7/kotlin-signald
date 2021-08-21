package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

@Serializable
public data class JsonVerifiedMessage(
    public val destination: JsonAddress? = null,
    public val identityKey: String? = null,
    public val verified: String? = null,
    public val timestamp: Long? = null
)

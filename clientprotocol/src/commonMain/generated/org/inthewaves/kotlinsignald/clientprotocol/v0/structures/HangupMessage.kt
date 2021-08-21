package org.inthewaves.kotlinsignald.clientprotocol.v0.structures

import kotlinx.serialization.Serializable

@Serializable
public data class HangupMessage(
    public val id: Long? = null,
    public val type: Type? = null,
    public val deviceId: Int? = null,
    public val legacy: Boolean? = null
)

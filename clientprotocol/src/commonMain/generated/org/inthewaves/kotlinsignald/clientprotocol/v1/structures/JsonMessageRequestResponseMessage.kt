package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

@Serializable
public data class JsonMessageRequestResponseMessage(
    public val person: JsonAddress? = null,
    public val groupId: String? = null,
    public val type: String? = null
)

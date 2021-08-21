package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

@Serializable
public data class JsonViewOnceOpenMessage(
    public val sender: JsonAddress? = null,
    /**
     * Example: 1615576442475
     */
    public val timestamp: Long? = null
)

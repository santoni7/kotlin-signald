package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 */
@Serializable
public data class TypingMessage(
    public val action: String? = null,
    public val timestamp: Long? = null,
    @SerialName("group_id")
    public val groupId: String? = null
)

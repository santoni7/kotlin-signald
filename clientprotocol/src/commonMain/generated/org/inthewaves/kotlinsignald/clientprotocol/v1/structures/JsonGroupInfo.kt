package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

/**
 * information about a legacy group
 */
@Serializable
public data class JsonGroupInfo(
    public val groupId: String? = null,
    public val members: List<JsonAddress> = emptyList(),
    public val name: String? = null,
    public val type: String? = null,
    public val avatarId: Long? = null
)
